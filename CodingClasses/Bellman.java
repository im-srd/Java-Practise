import java.util.*;
public class Bellman {
    private int d[];
    private int n;
    static final int max=999;
    public Bellman(int n){
        this.n=n;
        d=new int[n+1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of nodes");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter the adjancency matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==0){
                    a[i][j]=max;
                }
            }
        }
        System.out.println("enter the source vertex:");
        int s=sc.nextInt();
        Bellman b=new Bellman(n);
        b.BellmanFord(s,a);
    }
    public void BellmanFord(int s,int a[][]){
        for(int i=0;i<n;i++){
            d[i]=max;
        }
        d[s]=0;
        for(int k=0;k<n;k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != max) {
                        if (d[j] > d[i] + a[i][j]) {
                            d[j] = d[i] + a[i][j];
                        }
                    }
                }
            }
        }
            for(int i=0;i<n;i++){
                System.out.println("shortest distance from source " +s+ "to" +i+ "is" +d[i]);
            }

    }
}
