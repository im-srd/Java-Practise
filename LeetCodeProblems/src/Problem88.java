public class Problem88 {
    // Merge Sorted Array

    //nums1 and nums2 --> Array in Ascending Order
    // Merge both Arrays
    // Store it in nums1
    // Sort it in Ascending Order
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Merge nums1 and nums2
        for (int i=m,j=0; i< nums1.length;i++,j++)
        {
            nums1[i]=nums2[j];
        }
//        for(int i:nums1)
//            System.out.println(i);
        Problem88 p = new Problem88();

        p.MergeSort(nums1);
    }

    private void MergeSort(int[] arr) {

                int n = arr.length;
                boolean swapped;

                for (int i = 0; i < n - 1; i++) {
                    swapped = false;

                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            // Swap arr[j] and arr[j+1]
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                    }

                    // If no two elements were swapped in the inner loop, the array is already sorted
                    if (!swapped) {
                        break;
                    }
                }
        for(int i:arr)
            System.out.print(i+" ");
            }

    public static void main(String args[]){
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {1,2,4};
        Problem88 p = new Problem88();
        p.merge(nums1,3, nums2,3);
    }
}
