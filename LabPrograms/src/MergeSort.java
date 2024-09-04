import java.util.Scanner;

public class MergeSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the Elements :");
        for(int k=0;k<n;k++)
        {
            a[k]=sc.nextInt();
        }
        mSort(a,0,n-1);
        System.out.println("The Sorted Array is :");
        for(int x=0;x<=a.length;x++)
        {
            System.out.print(a[x]+"\t");
        }
    }

    static void mSort(int a[], int i, int j)
    {
        if(i<j) //jab tak 2 element ho
        {
            int mid=(i+j)/2;
            mSort(a,i,mid);
            mSort(a,mid+1,j);
            merge(a,i,mid,j);
        }
    }
    static void merge(int a[], int low, int mid, int high){
        int i=low;   //pehla array ka starting
        int j=mid+1;  //dushra array ka starting
        int k=low;   //sorted array (b[]) ka starting
        int b[]=new int[a.length];
        while(i<=mid && j<=high )  //pehla aur dushra array jab tak khatam na hojaye
        {
            if(a[i]<a[j]){
                b[k]=a[i];
                i++; k++;
            }else{
                b[k]=a[j];
                j++; k++;
            }
        }
        while(i<=mid)
        {
            b[k]=a[i];
            i++; k++;
        }
        while(j<=high)
        {
            b[k]=a[j];
            j++; k++;
        }
        for(i=low;i<=high;i++)
        {
            a[i]=b[i];
        }
    }
}