import java.util.Arrays;

public class TwoSumProblem {

    public static void getPairs(int[] arr, int targetSum) {
        // Input: X[] = [-5, 1, -40, 20, 6, 8, 7 ], targetSum = 15

        // complexity is still in the range of O(nlogn) due to the dominance of the sorting algorithm
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int actualSum = arr[left] + arr[right];
            if (actualSum < targetSum) {
                left++;
            }
            else if (actualSum > targetSum)  {
                right--;
            }
            else if (actualSum == targetSum) {
                System.out.println("("+arr[left]+ ","+arr[right]+ ")" + " are the pairs with sum "+ targetSum);
                left++;
                right--;
            }
        }

    }
}
