// Reverse Only Letters Input: "ab-cd" Output: "dc-ba" means all characters that are not a lettter stay in the same place.
import java.util.*;
class Soultion8 {
public String reverseOnlyLetters(String S) {
    Stack<Character> letters = new Stack();
 
    for (int i=0; i<S.length(); i++) {
        if (Character.isLetter(S.charAt(i))) {
            letters.push(S.charAt(i));
        }
    }
    StringBuilder reversed_string = new StringBuilder();

    for (int i=0; i<S.length(); i++) {
        if (Character.isLetter(S.charAt(i))) {
           reversed_string.append(letters.pop());
        } else {
            reversed_string.append(S.charAt(i));
        }
    }

    return reversed_string.toString();
}
}