package problems.hashtable;

import java.util.Map;

/**
 * Problem link: <a href="https://leetcode.com/problems/roman-to-integer/description/">LeetCode</a>
 */
public class RomanToInteger {
    // Hint: Problem is simpler to solve by working the string from back to front and using a map.
    private static int solution(String s) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        char prevChar = 0;
        for (var i = s.length() - 1; i >= 0; i--) {
            // backward add roman-mapped value into result
            char c = s.charAt(i);

            // if the current char value is less than previous char value, subtract result by current char value
            int charValue = romanMap.get(c);
            int prevCharValue = romanMap.getOrDefault(prevChar, 0);
            if (charValue < prevCharValue) {
                result -= charValue;
            } else { // else plus value
                result += charValue;
            }

            // set prev char for current
            prevChar = c;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV"; // 1994
        System.out.println(solution(s));
    }
}
