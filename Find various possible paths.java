There is a robot on a mXn grid.The robot is located at the top left corner(i.e. grid[0][0]).The robot tries to move to the bottom -right corner(i.e. grid[m-1][n-1]). The robot can only move either downwards or rightwards at any point of time.

Input Format

FIRST INPUT REPRESENT THE ROW SECOND INPUT REPRESENT THE COLUMN

Output Format

PRINT THE ALL POSSIBLE PATH NOTE: REFER THE SAMBLE INPUT AND OUTPUT.

Sample Input 0

3 2
Sample Output 0

[hvv, vhv, vvh]
Sample Input 1

3 1
Sample Output 1

[vv]

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<String> str = new ArrayList<>();
        String s ="";
        fun(0,0,s,str,m,n);
        System.out.print(str);
    }
    public static void fun(int row,int col,String s,ArrayList<String> str,int m,int n){
       if(row==m-1&&col==n-1){
           str.add(s);
           return;
       }
        if(col+1<n){
            fun(row,col+1,s+"h",str,m,n);
        }
        if(row+1<m){
            fun(row+1,col,s+"v",str,m,n);
        }
    }
}

