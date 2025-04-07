Write a program to implement a graph using an adjacency Matrix.

** - first2 inputs are number of vertices and edges
- Then graph is directed or un directed followed by edges.**

image

Input Format

4

4

yes

1 2 6

2 3 7

3 4 8

2 4 9

Output Format

Adjacency Matrix Representation:

0 6 0 0

0 0 7 9

0 0 0 8

0 0 0 0

Sample Input 0

4
4
yes
1 2 6
2 3 7
3 4 8
2 4 9

Sample Output 0

Adjacency Matrix Representation:
0 6 0 0
0 0 7 9
0 0 0 8
0 0 0 0

-----------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        sc.nextLine();
        String d = sc.nextLine();
        int[][] arr = new int[v][v];
        for(int i=0;i<e;i++){
            int s = sc.nextInt();
            int en = sc.nextInt();
            int w = sc.nextInt();
            arr[s-1][en-1]=w;
             if (d.equals("no")) {
                arr[en-1][s-1] = w;
            }
        }
        System.out.println("Adjacency Matrix Representation:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
        }
    
