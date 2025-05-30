Write a program to create linked list by appending the elements without its duplicate and print the resultant linked list and also the mid element of the linked list.

Input Format

Input consists of a single line of elements that belongs to the linked list.

Output Format

Output should be formatted in 2 lines : First line should be the linked list Second line should be the mid element of the linked list.

Sample Input 0

1 2 3 4
Sample Output 0

1 2 3 4
3
Sample Input 1

1 2 3 4 5
Sample Output 1

1 2 3 4 5
3
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class node 
{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
public class Solution {
   static node head=null;
   static node last=null;
    static void ins(int d)
    {
        node nn=new node(d);
        if(head==null)
        {
            head=nn;
            last=nn;
        }
        else
        {
            node t=head;
            while(t!=null)
            {
                if(t.data==d)
                    return;
                t=t.next;
            }
            last.next=nn;
            last=nn;
        }
    }
    static void dis()
    {
        node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    static int mid()
    {
        node s =head;
        node f=head;
        while(f!=null&&f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s.data;
    }
    public static void main(String[] args) {
       Scanner z=new Scanner(System.in);
        while(z.hasNext())
        {
            int a=z.nextInt();
            ins(a);
        }
        dis();
        System.out.println();
        System.out.print(mid());
    }
}


