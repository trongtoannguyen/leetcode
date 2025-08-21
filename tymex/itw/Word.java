package tymex.itw;

public class Word {
    // reverse words in an input string
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                reversed.append(words[i]).append(" ");
            }
        }
        return reversed.substring(0, reversed.length() - 1);
    }
}
