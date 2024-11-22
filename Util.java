import java.util.Arrays;
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
    
    // Heap Sort
    // Step1: build heap (heapify) to n element with root node defined
    private static void heapify(int[] array, int n, int root){
        int largest = root;
        int leftNode = root * 2 + 1;
        int rightNode = root * 2 +2;
        if(leftNode < n && array[leftNode] > array[largest]){
            largest = leftNode;
        }
        
        if(rightNode < n && array[rightNode] > array[largest]){
            largest = rightNode;
        }
        
        if(largest != root){
            // swap root with greater child node
            int temp = array[largest];
            array[largest] = array[root];
            array[root] =temp;
                    
            // recursive heapify the heap from largest node if it was damaged
            heapify(array, n, largest);
        }        
    }
    // Step2: swap root with last node and rebuild
    public static void heapSort(int[] arr){
        // heapify from last possibility parent node to root (0th)
        int n = arr.length;
        for(int root = n/2 - 1; root >= 0; root--){
            heapify(arr, n, root);
        }
        
        // swap root with last node and rebuild
        for(int i = n-1; i > 0; i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr, i, 0);
        }
    }
    
    // Merge sort
    // Step1: Incursively split the array ultil there is only one element in array parameter
    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }
        
        // find mid to split the array
        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);
        
        // incursively split until there is only one element in each sub-arrays and merge
        int[] sortedLeftArray = mergeSort(leftArray);
        int[] sortedRightArray = mergeSort(rightArray);
        
        // merge two halves left and right
        return merge(sortedLeftArray, sortedRightArray);
    }
    // Step2: compare and merge 2 sorted arrays
    private static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        
        // compare from the first element of each arrays ultil i or j out of parent array range
        // i, j: index of compare elements of arr1 and arr2 start from 0
        // k   : index of smaller element to assign in the merged array
        int i,j,k;
        i = j = k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr2[j] < arr1[i]){
                result[k] = arr2[j];
                j++;
            }else{
                result[k] = arr1[i];
                i++;
            }
            k++;
        }
        
        // copy remain elements (of one of 2 subarrays) to end of merged array
        while(i < arr1.length){
            result[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            result[k] = arr2[j];
            j++;
            k++;
        }
        return result;
    }
}


















