Given an undirected and disconnected graph G(V, E), print its BFS traversal.
Note:
Here you need to consider that you need to print BFS path starting from vertex 0 only.
V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
E is the number of edges present in graph G.
Take graph input in the adjacency matrix.
Handle for Disconnected Graphs as well

Input Format

The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains space separated two integers, that denote that there exists an edge between vertex a and b.

Constraints

0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second

Output Format

Print the BFS Traversal, as described in the task.

Sample Input 0

4 4
0 1
0 3
1 2
2 3

Sample Output 0

0 1 3 2

------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int a[][] = new int [v][v];
        for(int i=0;i<v;i++){
            int s = sc.nextInt();
            int end = sc.nextInt();
            a[s][end] = 1;
            a[end][s] = 1;
        }
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
            for(int y=0;y<v;y++){
                if(visited[y]==false && a[x][y]!=0){
                    q.add(y);
                    visited[y]=true;
                }
            }
        }
    }
}
