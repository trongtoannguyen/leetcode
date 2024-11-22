
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private static final int[] nums = {6,5,3,1,8,7,2};

    public static void main(){
        ArraySolution as = new ArraySolution();
        int[] cp = as.heightChecker(nums);
        Util.printArray(cp);
    }
}
