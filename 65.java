/* find all anagrams in a string s = "cbaebabacd" p = "abc" output: [0, 6] */
import java.util.ArrayList;
import java.util.List;

class Solutin42 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() == 0 || s == null) return result;

        int[] char_counts = new int[26];
        for (char c : p.toCharArray()) {
            char_counts[c-'a']++; // char frequency table
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while (right < s.length()) {
            if (char_counts[s.charAt(right++)-'a']-- >= 1) count--;

            if (count == 0) result.add(left);
            // left - right is sliding window.
            if (right - left == p.length() && char_counts[s.charAt(left++)-'a']++ >= 0) count++;
        }

        return result;
    }
}
