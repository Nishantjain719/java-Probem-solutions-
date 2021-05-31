// input: s = "a)b(c)d "output: "ab(c)d"
//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
class Solutin42 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) continue;
                open--;
            }

            sb.append(c);
        }
        StringBuilder result = new StringBuilder();
        for (int i=sb.length(); i>=0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0) continue;
            result.append(s.charAt(i));
        }

        return result.reverse().toString();

    }
}
