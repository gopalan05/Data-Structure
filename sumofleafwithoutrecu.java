import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Bt{
    Node root=null;
    void insert(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==-1){
            return ;
        }
        root=new Node(n);
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node cn=q.poll();
            int ld=sc.nextInt();
            if(ld!=-1){
                cn.left=new Node(ld);
                q.offer(cn.left);
            }
            int rd=sc.nextInt();
            if(rd!=-1){
                cn.right=new Node(rd);
                q.offer(cn.right);
            }
        }
    }
    void sumofleaf(){
        if(root==null){
            return ;
        }
        Queue<Node> q1=new LinkedList<>();
        q1.offer(root);
        while(!q1.isEmpty()){
            Node cn=q1.poll();
            if(cn.left==null&&cn.right==null){
                System.out.print(cn.data+" ");
            }
            if(cn.left!=null){
                q1.offer(cn.left);
            }
            if(cn.right!=null){
                q1.offer(cn.right);
            }
        }
    }
    
}
class Main{
    public static void main(String[] args){
        Bt b=new Bt();
        b.insert();
        b.sumofleaf();
    }
}
