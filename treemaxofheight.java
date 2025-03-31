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
    int maxof(Node root){
        if(root==null){
            return -1;
        }
        return 1+Math.max(maxof(root.left),maxof(root.right));
    }
}
public class Main {

    public static void main(String[] args) {
         Bt b=new Bt();
        b.insert();
        System.out.println(b.maxof(b.root));
    }
}
