import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2,4,21,3,4,5};
        int target = 11;
        find3Sum(arr,target);
    }
    public static void find3Sum(int[] arr, int target) {
        Arrays.sort(arr); // not required if the input is sorted
        int n = arr.length;

        // used for loop to fix the first element
        for (int i = 0; i < n; i++) {
            // convert the problem into 2Sum
            int low = i+1;
            int high = n-1;
            while(low < high) {
                int curr = arr[i] + arr[low] + arr[high];
               if (curr == target) {
                   System.out.println(arr[i] + " "+arr[low]+" "+arr[high]);
                   break;
               } else if (curr < target) {
                   low++;
               } else {
                   high--;
               }
            }

        }
    }
}
