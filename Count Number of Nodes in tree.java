You are given the root node of a binary tree.Count the number of nodes present.

Input Format

The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

Constraints

1 <= N <= 10^6
Where N is the total number of nodes in the binary tree.
Time Limit: 1 sec

Output Format

The only line of output prints the number of nodes in Binary Tree

Sample Input 

1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1

Sample Output 

7

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
        Queue<node> q = new LinkedList<>();
        node root = new node(sc.nextInt());
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            node T = q.poll();
            int d = sc.nextInt();
            i+=1;
            if(d!=-1){
                node nn = new node(d);
                T.left=nn;
                q.add(nn);
            }
            int c = sc.nextInt();
            i+=1;
            if(c!=-1){
                node nn = new node(c);
                T.right=nn;
                q.add(nn);
            }
        }
        System.out.print(count(root));  
    }
    static int count(node root){
       if(root==null)
           return 0;
       return 1+count(root.left)+count(root.right);
    }
}
