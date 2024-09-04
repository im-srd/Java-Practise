/*import java.util.Scanner;
class Prims{
    public static void main(String args[]){
        int ne,min,mincost;
        int f[]=new int[10]; //visited check karne k liye
        int c[][]=new int[10][10]; //cost adjacency matrix
        int a,b,i,j;
        ne=1; //number of edges
        a=0; //min node ka traversal dikhane k liye a aur b use kar rhe
        b=0;
        mincost=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n = sc.nextInt(); //n--> no. of nodes
        System.out.println("Enter the cost of the matrix");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
            {
                c[i][j]=sc.nextInt();
                if(c[i][j]==0)
                    c[i][j]=999;
            }
        for(i=1;i<=n;i++)
            f[i]=0; //sabko unvisited kar do
        f[1]=1; //source vertex
//PRIMS KA ASLI KHELA
        while(ne<n)
        {
            min=999;
            for(i=1;i<=n;i++)
                for(j=1;j<=n;j++)
                    if(c[i][j]<min && f[i]==1)
                    {
                        min=c[i][j];
                        a=i;
                        b=j;
                    }
            if(f[b]==0)
            {
                ne++;
                System.out.println("Edge\t->"+a+"\t--\t"+b+"\tMincost\t"+min);
                mincost+=min;
                f[b]=1;
            }
            c[a][b]=c[b][a]=999;
        }

        System.out.println("Mincost"+mincost);

    }
}*/

import java.util.Scanner;

class Prims{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c[][]=new int [10][10];
        int f[]=new int[10];
        int n,ne=1;
        int i,j,a=0,b=0;
        int min,mincost=0;
        System.out.println("Enter the number of the nodes:");
        n=sc.nextInt();
        System.out.println("Enter the Adjacency Matrix :");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++) {
                c[i][j] = sc.nextInt();
                if(c[i][j]==0)
                    c[i][j]=999;
            }
        for(i=1;i<=n;i++)
            f[i]=0;
        f[1]=1;

        while(ne<n)
        {
            min=999;
            for(i=1;i<=n;i++)
                for(j=1;j<=n;j++)
                    if(c[i][j]<min && f[i]==1)
                    {
                        min=c[i][j];
                        a=i;
                        b=j;
                    }
            if(f[b]==0)
                {
                        ne++;
                        System.out.println("Edge"+a+"-->"+b+"\tMincost :"+min);
                        mincost+=min;
                        f[b]=1;
                }
            c[a][b]=c[b][a]=999;
        }
        System.out.println("Total Mincost :"+mincost);
    }

}
