The task is to reverse the linked list. We need to reverse the list by changing the links between nodes.

To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the head data at the end.

Input Format

One line makes up the input.
Every input is an integer, separated by whitespace.

Constraints

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

Output Format

After reversing, print the connected list.
You can use recursive or iterative methods to reverse the linked list.
Can you put both into practise?

Sample Input 
1 2 3 4 5

Sample Output 
5 4 3 2 1

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class node{
    int data;
    node next;
    node(int d){
        data = d;
    }
}

public class Solution {
    
    static node head = null;
    static node last = null;
    
    static void ins(int d){
        node nn = new node(d);
        if(head==null){
            head=nn;
            last=nn;
        }
        else{
            last.next=nn;
            last=nn;
            }
        }
    static void dis(){
        node t = head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    static void rev(){
        node p = null;
        node c = head;
        node f = null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        head=p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int a = sc.nextInt();
                ins(a);
            }
            rev();
            dis();
        }
    }
