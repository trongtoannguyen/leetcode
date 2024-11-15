
/**
 * Write a description of class Ultilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Util
{
    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
                // ###############
                // SORT ALGORITHMS
                // ###############

    //  Bubble sort
    public static void bubbleSort(int[] array){
        int n = array.length;

        // outer loop(steps), start from 1
        for (int i = 1; i < n; i++) {
            // inner loop(elements(init 4) to compare) start from 0(index-based):
            // i=1->j=3 i=2->j=2 -->> j<n-i
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {
                // compare and swap j vs j+1
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    // flag to exit when the array is sorted
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
