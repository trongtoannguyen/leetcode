
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private static final int[] nums = {-4,-1,0,3,10};

    public static void main(){
        ArraySolution as = new ArraySolution();
        int[] cp = as.sortedSquares(nums);
        Util.printArray(cp);
    }
}
