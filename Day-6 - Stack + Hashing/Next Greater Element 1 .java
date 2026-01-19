import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

                for (int num : nums2) {

                        while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }

                        stack.push(num);
        }

                while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}