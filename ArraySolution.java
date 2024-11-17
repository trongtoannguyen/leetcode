 
/**
 * Write a description of class ArraySolution here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraySolution
{    
    public int[] sortArrayByParity(int[] nums) {
        int beg = 0;
        int end = nums.length - 1;
        
        while(beg <= end){
            if(nums[beg] % 2 == 0)
                beg += 1;
            else{
                int temp = nums[beg];
                nums[beg] = nums[end];
                nums[end] = temp;
                end -= 1;
            }
        }
        return nums;
    }
    
    // Problem2: Remove Element
    // Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    // The order of the elements may be changed.
    // Then return the number of elements in nums which are not equal to val.
    public int removeElement(int[] nums, int val) {
        // init write pointer(black) and read pointer(green) at the first element
        int writePointer = 0;
        
        // loop to the last element, if read element:
        for(int readElement : nums){
            // not equals val, swap write element with read element and move write to right
            if(readElement != val){
                int temp = readElement;
                readElement = nums[writePointer];
                nums[writePointer] = temp;
                writePointer++;
            }
            // equals val, continue
        }
        return writePointer;
    }
    
    public int[] heightChecker(int[] heights) {
        // Solution 1: Selection Sort
        // Pros: Many Swaps
        // copy origin array and loop this copy array then swap current element with min of unsorted array
        int[] cp = heights.clone();
        int n = cp.length;
        for(int i = 0; i < n; i++){
            // init min at first unsorted element
            int min = cp[i];
            int minIdx = i;
            // find min and its index of unsorted array
            for(int j = i + 1; j < n; j++){
                if(cp[j] < min){
                    min = cp[j];
                    minIdx = j;
                }
            }
            
            // swap element at min's index with current element
            if(min != cp[i]){
                int temp = cp[minIdx];
                cp[minIdx] = cp[i];
                cp[i] = temp;
            }
        }
        return cp;
    }
}
