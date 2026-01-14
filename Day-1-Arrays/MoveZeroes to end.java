// Problem: Move Zeroes to End
// Approach: Two pointers
// Time Complexity: 0(n)
// Space Complexity: 0(1)

public class MovesZeroes {
    public static void moveZeroes(int[] arr) {
    int index = 0;
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[index] = arr[i];
            index++;
            }
    }
    
      while (index < arr.length) {
          arr[index] = 0;
          index++;
      }
}
  public static void main(String[] args) {
       int[] arr = {0, 1, 0 , 2, 12};
       
       moveZeroes(arr);
       
       for (int n : arr) {
        System.out.println(n + " ");
       }
  }
  }