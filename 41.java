/* The java.util.HashMap.containsValue() method is used to check whether 
a particular value is being mapped by a single or more than one key in the HashMap. 
It takes the Value as a parameter and returns True if that value is mapped by any of the key in the map.
input: pattern = "abba" str = "dog, cat, cat, dog" output: true*/
import java.util.*;

class Solutin38 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split("");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();
        for (int i=0; i<pattern.length(); i++) {
            char current_char = pattern.charAt(i);
            if (map.containsKey(current_char)) {
                if (!map.get(current_char).equals(words[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {

                    return false;
                }
                map.put(current_char, words[i]);
            }
        }
        return true;
    }
}
