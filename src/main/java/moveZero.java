import java.util.Arrays;

public class moveZero {
    // input:  0 1 0 3 12
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveAllZerosToLeft(arr);
    }
    public static void moveAllZerosToLeft(int[] arr) {
        int n = arr.length;
        // base case
        if (arr.length < 2) return;

        // define pointers
        int left = 0, right = 1;

        // cases: move zeros to the left
        while (right < n) {
            // check if left pointer value isn't zero then move both pointer to the right side
            if (arr[left] != 0) {
                left++;
                right++;
            }
            // check if right pointer value is equal to zero then move right pointer to the left side
            else if (arr[right] == 0) {
                right++;
            }
            // if both conditions doesn't match that means left = 0, and right != 0
            // then swap to the right side to the zero with no zero element
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }


}
