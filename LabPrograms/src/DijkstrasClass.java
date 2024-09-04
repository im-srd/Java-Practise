//import java.util.Scanner;
//
//public class DijkstrasClass {
//    final static int MAX=20;
//    final static int infinity=999;
//    static int n; //No. of vertices
//    static int a[][]; //Adjacency Matrix
//    static Scanner sc=new Scanner(System.in);
//
//    public static void main(String args[]){
//        Readmatrix();
//        int s=0; //starting vertex
//        System.out.println("Enter the source vertex :");
//        s=sc.nextInt();
//        Dijkstras(s); //find shortest path
//    }
//
//    static void Readmatrix()
//    {
//        a=new int[MAX][MAX];
//        System.out.println("Enter the number of Vertices :");
//        n=sc.nextInt(); //n=5
//        System.out.println("Value of n :" +n);
//        System.out.println("Enter the cost adjacency matrix :");
//        for(int i=1;i<=n;i++)
//            for(int j=1;i<=n;j++)
//                a[i][j]=sc.nextInt();
//    }
//
//    static void Dijkstras(int s)
//    {
//        int S[]=new int[MAX]; //to store visited vertex
//        int d[]=new int[MAX]; //to store distance from source vertex
//
//        int u,v;
//        int i;
//        for(i=1; i<=n;i++)
//        {
//            S[i]=0;
//            d[i]=a[s][i];
//        }
//        S[s]=1;
//        d[s]=1;
//
//        i=2;
//
//        while(i<=n)
//        {
//            u=findmin(S,d);  //u=2
//            S[u]=1;   //s[2]=1
//            i++;      //i=3
//            for(v=1;v<=n;v++)
//            {
//                if(((d[u] + a[u][v] < d[v] ) && (S[v] == 0 )))
//                    d[v]=d[u] + a[u][v];
//            }
//        }
//        for(i=1;i<=n;i++)
//            if(i != s)
//                System.out.println(i+":"+d[i]);
//    }
//
//    static int findmin(int S[], int d[])
//    {
//        int i,j=1,min;
//        min=infinity;
//        for(i=1;i<=n;i++)
//        {
//            if((d[i]<min) && (S[i]==0))
//            {
//                min=d[i];
//                j=i;
//            }
//        }
//        return j;   //return 2
//    }
//}
//
///*  0   2   4 999   999 999
//*   999 0 1 7 999   999
//*   999 999 0   999 3 999
//*   999 999 999 0   999 1
//*   999 999 999 2   0   5
//*   999 999 999 999 999 0 */


import java.io.*;
import java.util.*;
public class DijkstrasClass{
    public static void main(String args[]){
        int c[][]=new int[10][10];
        int dist[]=new int[10];
        int path[]=new int[10];
        int visited[]=new int[10];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        System.out.println("Enter the adjacency matrix");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                c[i][j]=sc.nextInt();
        System.out.println("Entered adjacency matrtix is:");
        for(i=1;i<=n;i++){

            for(j=1;j<=n;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter the source vertex:");
        int sv=sc.nextInt();
        dij(c,dist,path,visited,n,sv);
        printpath(dist,path,visited,n,sv);
    }
    static void dij(int c[][],int dist[],int path[],int visited[],int n,int sv){
        int i,j;
        int v=0;
        int count=2;
        for(i=1;i<=n;i++){
            visited[i]=0;
            dist[i]=c[sv][i];
            if(c[sv][i]==999){
                path[i]=0;
            }
            else
                path[i]=sv;
        }
        visited[sv]=1;
        while(count<=n){
            int min=999;
            for(int w=1;w<=n;w++){
                if(dist[w]<min && visited[w]==0){
                    min=dist[w];
                    v=w;
                }
            }
            visited[v]=1;
            count++;
            for(int w=1;w<=n;w++){
                if(dist[w]>dist[v]+c[v][w]){
                    dist[w]=dist[v]+c[v][w];
                    path[w]=v;
                }
            }
        }
    }
    static void printpath(int dist[],int path[],int visited[],int n,int sv){
        for(int w=1;w<=n;w++){
            if(visited[w]==1 && (w!=sv) )
                System.out.println("Shortest distance between"+sv+"and"+w+"is:"+dist[w]);
        }
    }
}
















