// Missing number in an array (Optimized code)
public class A {

    private static int missingnum(int[] arr, int n) {
        // Step 1: Calculate the total sum of first n natural numbers
        int totalsum = n * (n + 1) / 2;
        int sum = 0;

        // Step 2: Find the sum of all elements in the array
        for (int num : arr) {
            sum += num;
        }

        // Step 3: Missing number = totalsum - sum
        return totalsum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int sol = missingnum(arr, n);
        System.out.println("Missing num is: " + sol);
    }
}
