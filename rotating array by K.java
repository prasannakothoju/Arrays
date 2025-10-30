class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; // to handle when k > n
        //If k is greater than n, we only need to rotate by k % times       because rotating n times gives the same array.

         // Step 1: Reverse the whole array
         reverse(nums,0,n-1);

         // Step 2: Reverse the first k elements
         reverse(nums,0,k-1);

         // Step 3: Reverse the remaining n-k elements
         reverse(nums,k,n-1);
    }

    //creating function for reverse
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
        int temp = nums[start];
        nums[start]= nums[end];
        nums[end]= temp;
        start++;
        end--;
        }
    }

    // main method to execute and test the program
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

// Time Complexity: O(n)
// -> Each element is reversed once (three reversals total = 3n ≈ O(n)).
// Space Complexity: O(1)
// -> In-place rotation using only constant extra space.
