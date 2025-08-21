import java.util.HashMap;

class Solution {
    public boolean checkIfExist(int[] arr) {
        // Solution: Using HashMap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // traverse the arr
        for(int i = 0; i< arr.length; i++){
            if(map.containsKey(arr[i]*2) || map.containsKey(arr[i]/2)){
                // return true if map contains element that meet condition and map does not contain this element
                return true;
            }else{
                // 
                map.put(arr[i], i);
            }
        }
        return false;
    }
}