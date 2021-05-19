/* static final int chars=256; static char count[]=new char[chars];
 0 1 2 3 4 5 6 7 8 9 .. .. ..  97 .. 255(indexes)
 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0(values)
 Second

count[str.charAt(i)]++;

Let say you have str = “abc” Then str.charAt(0) will be “a” Then count[‘a’] means count[97] why? 
Because java automatically converted ‘a’ into ASCII code number 97; 
Then count[97] value is 0 when you increment it like this count[97]++ then it will become 1

0 1 2 3 4 5 6 7 8 9 .. .. .. .. .. .. .. 97 .. 255

0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0

if you increment it again like count[97]++ then it will become 2.

0 1 2 3 4 5 6 7 8 9 .. .. .. .. .. .. .. 97 .. 255

0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 0 0

input: 'abccccdd' output: 7

*/
import java.util.*;

class Solutin23 {
   public int longestPalindrome(String s) {
       int[] char_counts = new int[128];
       for (char c : s.toCharArray()) {
           char_counts[c]++;
       }

       int result = 0;
       for (Integer char_count : char_counts) {
           result += char_count / 2 * 2;
           if (result % 2 == 0 && char_count % 2 == 1) {

            result += 1;
           }

       }
       return result;
   }
}
