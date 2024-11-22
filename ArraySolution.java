 
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
        // Solution 3: Merge sort
        heights = Util.mergeSort(heights);
        return heights;
    }
}
