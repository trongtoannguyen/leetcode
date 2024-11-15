
/**
 * Write a description of class InPlaceOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InPlaceOperations
{    
    public InPlaceOperations()
    {
    }

    public int[] replaceElements(int[] arr) {
    
        // test case:
        // [3,7,8,5]
        // [3,9,8,5]
        int n = arr.length;
        
        // loop from end with init max at the last element
        // compare max with elements stand before it in order from the last to the first element
        // if max is less than element, swap them
        // ELSE assign max to element
        int max = arr[n-1];
        // change last element to -1
        arr[n-1] = -1;
        for(int i = n - 2; i >= 0; i--){
            if(max < arr[i]){
                // swap
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }else{
                arr[i] = max;
            }
        }
        
        return arr;
    }
    
    // MOVE ZEROS
    public void moveZeroes(int[] nums) {
        // init writePointer and readPointer at the first element
        // readPointer traverses arr from left to right
        // if readPointer element is other than 0, change writePointer element to readPointer element 
        // and move writePointer to the right
        // after loop replace value from [writePointer] to end of array with 0
        
        // Edge case
        

        int n = nums.length;
        int writePointer = 0;
        int readPointer;
        for(readPointer = 0; readPointer < n; readPointer++){
            if(nums[readPointer] != 0){
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        
        while(writePointer < n){
            nums[writePointer] = 0;
            writePointer++;
        }
    }
}
