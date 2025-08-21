import java.util.List;

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
        String url = "/questions/1;2;3;4/favorites?order=desc&sort=activity";

        List<String> ids = UrlIdExtractor.extractIdsFromUrl(url);

        System.out.println("Extracted IDs: " + ids);
    }
}
