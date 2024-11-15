import java.util.Arrays;
    
class ArraySolution {
    
    public int heightChecker(int[] heights) {
        // Solution 2: Bubble Sort

        // Step1: sort copied array of heights[]
        // copy origin array and sort
        int[] cp = heights.clone();
        int n = cp.length;

        // outer loop(steps), start from 1
        for (int i = 1; i < n; i++) {
            // inner loop(elements(init 4) to compare) start from 0(index-based):
            // i=1->j=3 i=2->j=2 -->> j<n-i
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {
                // compare and swap j vs j+1
                if (cp[j] > cp[j + 1]) {
                    int temp = cp[j + 1];
                    cp[j + 1] = cp[j];
                    cp[j] = temp;
                    // flag to exit when the array is sorted
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        // Step2: compare cp vs heights array
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != cp[i]) {
                k += 1;
            }
        }
        return k;
    }
}