package tymex.itw;
import java.util.Arrays;

public class SubsetSumBacktracking {
    private int count = 0; // To store the count of valid subsets

    public int countSubsets(int[] arr, int targetSum) {
        Arrays.sort(arr); // Step 1: Sort the array
        backtrack(arr, targetSum, 0, 0);
        return count;
    }

    private void backtrack(int[] arr, int targetSum, int index, int currentSum) {
        // If current sum exceeds the target, stop further exploration
        if (currentSum > targetSum) return;

        // If we reach the target sum, count it as a valid subset
        if (currentSum == targetSum) {
            count++;
            return; // Stop further exploration
        }

        // Explore further elements
        for (int i = index; i < arr.length; i++) {
            // Backtracking: include arr[i] and move forward
            backtrack(arr, targetSum, i + 1, currentSum + arr[i]);
        }
    }

    public static void main(String[] args) {
        SubsetSumBacktracking solver = new SubsetSumBacktracking();
        int[] arr = {2, 3, 5, 6, 8, 10, 7};
        int targetSum = 10;

        System.out.println("Number of subsets with sum " + targetSum + ": " + solver.countSubsets(arr, targetSum));
    }
}
