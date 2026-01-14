// Problem: Majority Element (n/2)
// Approach: Boyer-Moore Voting Algorithm
// Time Complexity: 0(n)
// Space Complexity: 0(1)

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            if (count == 0) {
               candidate = num;
               count = 1;
        } else if (num == candidate) {
              count++;
        } else {
            count--;
        }
        }
          return candidate;
               }
               public static void main(String[] args) {
                   int [] arr = {1, 2, 2, 4, 3, 5, 2};
                   System.out.println(majorityElement(arr));
               }
}