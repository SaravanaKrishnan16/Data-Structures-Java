Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
Example :
Given this linked list: 1 -> 2 -> 3 -> 4 -> 5
For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5
For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4

Input Format
The first line of each test case or query contains the elements of the singly linked list separated by a single space.
The second line of input contains a single integer depicting the value of 'k'.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element

Constraints
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= k <= M
Time Limit: 1sec

Output Format
For each test case/query, print the elements of the updated singly linked list.

Sample Input 
1 2 3 4 5 -1
0

Sample Output 
1 2 3 4 5

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Node head;
    Node temp;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void ins(int data)
    {
        Node nn=new Node(data);
        if(head==null)
        {
            head=nn;
            temp=nn;
        }
        else
        {
            temp.next=nn;
            temp=nn;
        }
    }
    
    Node rev(int key,Node head)
    {
        Node pre=null;
        Node cur;
        Node nxt;
        cur=head;
        int c=0;
        while(cur !=null&&c!=key)
        {
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt; 
            c++;
        }
        if(cur!=null)
           head.next= rev(key,cur);
       return pre;
    }
    
    void dis()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }  
    }
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        Solution s=new Solution();
        while(true)
        {
            int n=z.nextInt();
                if(n!=-1)
                  s.ins(n);
                else
                    break;
        }
        int key=z.nextInt();
        if(key!=0){
        head=s.rev(key,head);
        }
        s.dis();
      
    }
}

