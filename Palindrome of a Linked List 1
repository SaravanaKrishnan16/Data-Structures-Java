You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.

Input Format

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space. Remember/Consider : While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.

Constraints

0 <= M <= 10^5 Time Limit: 1sec Where 'M' is the size of the singly linked list.

Output Format

For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.

Sample Input 
1 2 3 3 3 1 -1

Sample Output 
false

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
    
    static node ohead = null;
    static node olast = null;
    static node ehead = null;
    static node elast = null;
    
    static void l1(int d){
        node nn = new node(d);
        if(ohead==null){
            ohead=nn;
            olast=nn;
        }
        else{
            olast.next=nn;
            olast=nn;
        }
    }
    static void l2(int d){
        node nn = new node(d);
        if(ehead==null){
            ehead=nn;
        }
        else{
            nn.next=ehead;
            ehead=nn;
        }
    }
    static void dis(){
        int flag = 0;
        olast=ohead;
        elast=ehead;
        while(olast!=null){
            if(olast.data!=elast.data){
                flag=1;
                break;
            }
            olast=olast.next;
            elast=elast.next;
        }
        if(flag==0){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int a = sc.nextInt();
                if(a!=-1){
                    l1(a);
                    l2(a);
                }
                else{
                    break;
                }
            }
            dis();
    }
}

