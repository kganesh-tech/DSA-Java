import java.util.*;

public class MaximumSubarrayWithK {

    public static int maxSubarraySum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

                for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        System.out.println("Maximum Subarray Sum of size " + k + " is: " + maxSubarraySum(arr, k));
    }
}