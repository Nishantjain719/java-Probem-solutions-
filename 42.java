/* The statement ++array[s.charAt(i) - 'A']; is incrementing the value in the array indexed by s.charAt(i) - 'A'.

What this loop does is that it counts up the number of occurrences of each letter in s.

The reason for - 'A', is that it "shifts" the ascii/unicode value so that A - Z have values 0 - 25. And are thus more suitable as an array index.
 input: s = "anagram" t = "nagaram" output: true */
class Solutin42 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] char_counts = new int[26];
        for (int i=0; i<s.length(); i++) {
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }

        for (int count : char_counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
