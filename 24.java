import java.util.*;

class Solutin23 {
    String digits="23"; 
    public List<String> letterCombinations(String digits) {
        
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0","1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for (int i=0; i<digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            System.out.println("i - ");
            System.out.println(i);
            while(ans.peek().length()==i) {
                String t = ans.remove();
                System.out.println("t - ");
                System.out.println(t);
                for (char s : mapping[index].toCharArray()) {
                    System.out.println("t+s ");
                    System.out.println(t+s);
                    ans.add(t+s);
                }
            }
        }
        return ans;
    }
}