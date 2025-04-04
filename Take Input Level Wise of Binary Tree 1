Take Input Level Wise of Binary Tree and then print in the inorder format

Input Format

-

Constraints

-

Output Format

Inorder traversal of Binary tree

Sample Input 0

1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

Sample Output 0

4 2 5 1 6 3 7

------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

class node{
    int data;
    node left,right;
    node(int d){
        data=d;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        Queue<node> q = new LinkedList<>();
        node root = new node(Integer.parseInt(a[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            node T = q.poll();
            int d = Integer.parseInt(a[i]);
            i+=1;
            if(d!=-1){
                node nn = new node(d);
                T.left=nn;
                q.add(nn);
            }
            int c = Integer.parseInt(a[i]);
            i+=1;
            if(c!=-1){
                node nn = new node(c);
                T.right=nn;
                q.add(nn);
            }
        }
        inorder(root);
    }
    static void inorder(node root){
        if(root==null){
            return;
        }
        else{
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
