public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int uniq[] = new int[nums.length];
        int index = 0;
        int val = 0;

        for (int i = 0 ; i<nums.length ; i++){
            val = nums[i];
            uniq[index] = val;
            index++;
                if (nums[i] == nums[i+1]){
                    continue;           // next iteration for same element
                }
                else{
                    break;              // next iteration for next element
                }
            }


        for(int l=0; l<nums.length; l++){
            nums[l]=0;
            nums[l] = uniq[l];
        }
        for (int a:uniq)
            System.out.println(a);
        return index;
    }

    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,2,3,3,4,4,4,5};
        Solution26 s = new Solution26();
        int k = s.removeDuplicates(arr);
//        for (int i:arr){
//            System.out.println(i);
//        }
        System.out.println("k = "+k);

    }
}
