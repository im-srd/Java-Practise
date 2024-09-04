public class Solution27 {
    // given nums[] array and int 'val'
    // remove all occurences of val in num
    // return k --> elements left in nums

    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i=0; i< nums.length;i++) {
            if (nums[i] == val) {
                nums[i] = 0;
                k--;
            }
            int temp;
            for (i=0;i< nums.length-1;i++){
                if (nums[i]==0)
                {
                    temp = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
return k;
    }

    public static void main(String args[]){
        int[] nums = {3,2,2,3}; // Input array
        int val = 3; // Value to remove
        //int[] expectedNums = [...]; // The expected answer with correct length.
        // It is sorted with no values equaling val.
        Solution27 s  =new Solution27();

        int k = s.removeElement(nums, val); // Calls your implementation
        for(int i:nums){
            System.out.println(i);
        }
        System.out.println("k = "+k);
//        assert k == expectedNums.length;
//        sort(nums, 0, k); // Sort the first k elements of nums
//        for (int i = 0; i < actualLength; i++) {
//            assert nums[i] == expectedNums[i];
//        }
    }
}
