import java.util.*;
public class Bellman_Ford_Algorithm {
    //It accept negative weight also
    // Check -->  D[dn] > D[sn] + A[sn][dn] if A[sn][dn] != MAX
    private int D[]; //Array in which the shortest distance is stored
    private int n; //Number of nodes
    public static final int MAX=9999;

    public Bellman_Ford_Algorithm(int n){
        this.n=n;
        D = new int[n + 1];
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of nodes");
        int n=sc.nextInt();
        int a[][]= new int[n][n]; //Adjacency Matrix
        System.out.println("Enter the adjacency Matrix");
        for (int sn=0;sn<n;sn++)
            for(int dn=0;dn<n;dn++) {
                if(sn==dn){
                    a[sn][dn]=0;
                    continue;}
                a[sn][dn] = sc.nextInt();
                if (a[sn][dn]==0)
                    a[sn][dn]=MAX;
            }
        System.out.println("Enter the Source vertex :");
        int s=sc.nextInt();
        Bellman_Ford_Algorithm b =new Bellman_Ford_Algorithm(n); //Initialise node value
        b.ford(a,s);
    }

    private void ford(int[][] a, int s) {
        //for loop se D[] ko max max karna hai
        for (int i=0;i<n;i++)
            D[i]=MAX;
        D[s]=0;

        for(int node=1; node<n-1;node++)
            for(int sn=0;sn<n;sn++)
                for(int dn=0;dn<n;dn++)
                {
                    if(a[sn][dn] != MAX)
                    {
                        if (D[dn]>D[sn] + a[sn][dn])
                            D[dn]=D[sn] + a[sn][dn];
                    }
                }

        for(int i=0;i<n;i++)
            System.out.println("The shortest distance from source "+s+" to "+i+" is "+D[i]);
    }


}

