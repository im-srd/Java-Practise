////import java.util.Scanner;
////
////public class QuickSort {
////    static int n;
////    static int a[] = new int[n];
////    static Scanner sc;
////
////    static void swap(int a, int b) {
////        int temp;
////        temp = a;
////        a = b;
////        b = temp;
////    }
////
////    static int partition(int a[], int i, int j) {
////        int pivot = a[i];
////        int start = i + 1;
////        int last = j;
////        int temp;
////        while (i < j) {
////            while (a[start] <= pivot) start++;
////            while (a[last] > pivot) last--;
////
////            if (start < last)
////                swap(a[start], a[last]);
////            else
////                swap(a[last], pivot);
////
////        }
////        return last;
////    }
////
////    public static void quicksort(int a[], int i, int j) {
////        int s;
////        if (i < j) {
////            s = partition(a, i, j);
////            quicksort(a, i, s - 1);
////            quicksort(a, s + 1, j);
////        }
////    }
////
////    public static void main(String args[]) {
////        sc = new Scanner(System.in);
////        System.out.println("***QUICK SORTING***");
////
////        System.out.println("Enter the length of the array :");
////        n = sc.nextInt();
////
////        System.out.println("Enter the elements of the array :");
////        for (int i = 0; i < n; i++) {
////            a[i] = sc.nextInt();
////        }
////        System.out.println("The Entered elements are:");
////        for (int i = 0; i < n; i++)
////            System.out.print(a[i] + " ");
////
////        QuickSort q = new QuickSort();
////        q.quicksort(a, 0, n - 1);
////        System.out.println();
////        System.out.println("The Sorted elements are:");
////        for (int i = 0; i < n; i++)
////            System.out.print(a[i] + " ");
////    }
////
////}
//
//
//import java.util.Scanner;
//
//class QuickSort{
//    public static void quicksort(int[] a, int low, int high) {
//        if(low<high)
//        {
//            int s=partition(a,low,high);
//            quicksort(a,low,s-1);
//            quicksort(a,s+1,high);
//        }
//    }
//    public static int partition(int[] a,int low,int high){
//        int pivot=a[low];
//        int i=low+1;
//        int j=high;
//
//        while(low < high)
//        {
//            while(a[i]<=pivot)
//                i++;
//            while(a[j]>pivot)
//                j--;
//            if(i<j)
//            {
//                //swap a[i] and a[j]
//                int temp1;
//                temp1=a[i];
//                a[i]=a[j];
//                a[j]=temp1;
//            }
//            else if(i>j)
//            {
//                //swap a[j] and pivot
//                int temp2;
//                temp2=a[low];
//                a[low]=a[j];
//                a[j]=temp2;
//                return j;
//            }
//        }return j;
//    }
//
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int n;
//        System.out.println("Enter the number of elements:");
//        n=sc.nextInt();
//        int a[]=new int[n];
//        System.out.println("Enter the Elements:");
//        for(int i=0;i<n;i++)
//            a[i]=sc.nextInt();
//        quicksort(a,0,n-1);
//        for(int i:a)
//            System.out.println(i+" ");
//    }
//}
//
///*import java.io.*;
//import java.util.Random;
//import java.util.Scanner;
//class QuickSort
//{
//    static int max=5000;
//    void quicksort(int a[], int low, int high)
//    {
//        int s;
//        if(low<high) //To check for boundary condition
//        {
//            s=partition(a,low,high);
//            quicksort(a,low,s-1);
//            quicksort(a,s+1,high);
//        }
//    }
//    int partition(int a[], int low, int high)
//    {
//        int p, i, j, temp;
//        p=a[low];
//        i=low+1;
//        j=high;
//        while (low<high)
//        {
//            while (a[i]<=p &&i<high)
//                i++;
//            while (a[j]>p)
//                j--;
//            if (i<j)
//            {
//                temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;
//            }
//            else
//            {
//                temp=a[low];
//                a[low]=a[j];
//                a[j]=temp;
//                return j;
//            }
//        } //End While
//         return j;
//    } //End Partition
//    public static void main(String args[])
//    {
//        int a[], i, n;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the Number of elements to be sorted"); n=sc.nextInt();
//        a= new int[max]; //initialize array with max size Random generator=new Random();
//        System.out.println("Enter the Elements:");
//        for(i=0;i<n;i++)
//            a[i]=sc.nextInt();
//        long startTime=System.nanoTime(); //start time
//        QuickSort qs = new QuickSort(); //Object
//        qs.quicksort(a,0,n-1);
//        long stopTime=System.nanoTime();
//        long elapseTime=(stopTime-startTime);
//        System.out.println();
//        System.out.println("Sorted array is");
//        for(i=0;i<n;i++)
//            System.out.print(a[i]+"\t");
//        System.out.println();
//        System.out.println("Time taken to sort given array is: "+elapseTime+" nano seconds");
//    }
//}*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;
class QuickSort
{
    static int max=5000;
    void quicksort(int a[], int low, int high)
    {
        int s;
        if(low<high) //To check for boundary condition
        {
            s=partition(a,low,high);
            quicksort(a,low,s-1);
            quicksort(a,s+1,high);
        }
    }
    int partition(int a[], int low, int high)
    {
        int p, i, j, temp;
        p=a[low];
        i=low+1;
        j=high;
        while (low<high)
        {
            while (a[i]<=p &&i<high)
                i++;
            while (a[j]>p)
                j--;
            if (i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else
            {
                temp=a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
        } //End While
        return j;
    } //End Partition
    public static void main(String args[])
    {
        int a[], i, n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of elements to be sorted"); n=sc.nextInt();
        a= new int[max]; //initialize array with max size
        Random generator=new Random();
        for(i=0; i<n; i++)
        {
            a[i]=generator.nextInt(50);
        }
        System.out.println("The Inputs generated by Random Number Generated are: ");
        for(i=0; i<n; i++)
            System.out.print(a[i]+"\t");
        long startTime=System.nanoTime(); //start time
        QuickSort qs = new QuickSort(); //Object
        qs.quicksort(a,0,n-1);
        long stopTime=System.nanoTime();
        long elapseTime=(stopTime-startTime);
        System.out.println();
        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        System.out.println("Time taken to sort given array is: "+elapseTime+" nano seconds");
    }
}