import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlIdExtractor {

    /**
     * Extracts user IDs from the given URL.
     * Expects URL pattern: /users/{ids}/favorites
     * 
     * @param url the URL to extract from
     * @return List of IDs as Strings
     */
    public static List<String> extractIdsFromUrl(String url) {
        // Define regex pattern: matches '/users/{ids}/'
        String regex = "/([\\d;]+)/";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            // Group 1 contains the ids string "1;2;3;4"
            String idsString = matcher.group(1);
            // Split by semicolon to get individual IDs
            return Arrays.asList(idsString.split(";"));
        } else {
            // Return an empty list if no match found
            return List.of();
        }
    }
}