import java.io.*;

public class LSearch {
    public static void main(String args[]){

        int a[] = { 5,6,2,1,3};
        int key = 3;
        long start1 = System.currentTimeMillis();
        lSearch(a,key);
        long end1 = System.currentTimeMillis();

        int b[] = { 1,2,4,3,6 };
        long start2 = System.currentTimeMillis();
        bSearch(b,key);
        long end2 = System.currentTimeMillis();

        System.out.println("Time taken by Linear Search :"+(end1-start1));
        System.out.println("Time taken by Binary Search :"+(end2-start2));
    }

    static void lSearch(int a[], int key)
    {
        boolean flag = false;
        for (int i=0; i<a.length;i++){
            if (a[i] == key){
                System.out.println("Found at "+(i+1));
                flag = true;
            }
        }
        if (flag == false)
            System.out.println("Key not Found !!");
    }

    static void bSearch(int a[], int key){
        int mid = a.length/2;
        boolean flag = false;
        /*
        if (a.length % 2 == 0)
            mid = (a.length  / 2)-1;
        else
            mid = (a.length  / 2);
        */
        int b[] = new int[0];
        if (key == a[mid])
        {
            System.out.println("Found at "+(mid+1));
            flag = true;
            return;
        }
        else if (key < a[mid])
        {
            // a[0 : mid]
            for(int i=0; i<mid;i++)
            {
                b[i] = a[i];
            }
            bSearch(b,key);
        }
        else {
            // a[ mid+1 : a.length]
            for (int i = mid+1;i<a.length;i++){
                b[i]=a[i];
            }
            bSearch(b,key);
        }
        if (flag == false)
            System.out.println("Not Found");
        }
}
