// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public double median(int []a){
        int size = a.length;
        if (size == 0) return 0.0;
        if (size%2 == 0){
            return ((double)a[(size/2)-1] + (double)a[((size/2)+1)-1])/2;
        }
        else
            return a[((size+1)/2)-1];
    }

    public void sort(int a[]){
        int i = 0,j = 0;
        int temp = 0;
        while(i != a.length){
            j = i+1;
            while(j != a.length)
            {
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j = j+1;
            }
            i = i+1;
        }
    }


    public static void main(String[] args) {
        int nums1[] = {1, 2};
        int nums2[] = {3, 4};
        HelloWorld s = new HelloWorld();
        int nums12[] = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++)
            nums12[i] = nums1[i];
        int k = 0;
        for (int j = nums1.length; j < nums12.length; j++){
            nums12[j] = nums2[k];
            k++;
    }

        for(int x:nums12)
            System.out.print(x+" ");
        System.out.println();
        s.sort(nums12);
        for(int x:nums12)
            System.out.print(x+" ");
        System.out.println();
        double c = s.median(nums12);
        System.out.println(c);


        String name = "shyam";
        int n=9;
        System.out.println(name.getClass());

    }
}