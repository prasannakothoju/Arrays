public class Main {

    /*
       Optimized Approach: Dutch National Flag Algorithm
       
       Time Complexity: O(N)
            - We only scan the array once using mid pointer.
            - Each element is processed at most once.

       Space Complexity: O(1)
            - We sort the array in-place.
            - No extra array or data structure used.
    */

    public static void sortColors(int[] nums) {

        int low = 0;                     // pointer for 0s
        int mid = 0;                     // pointer for current element
        int high = nums.length - 1;      // pointer for 2s

        // Loop until mid crosses high
        while (mid <= high) {

            if (nums[mid] == 0) {
                // Swap nums[mid] with nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {
                // 1 stays in the middle → just move mid
                mid++;
            }

            else { // nums[mid] == 2
                // Swap nums[mid] with nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
                // mid not incremented because new value at mid must be checked
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        System.out.print("Sorted array: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
