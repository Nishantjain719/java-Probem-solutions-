/* a = "11"
   b =  "1" 
   for given a and b sum(2) % 2 = 0 and we append 0 to the string and we carry 
   the one over next sum*/
class Solutin42 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        // i and j are pointers
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString(); // bc append put things at the end so to get the right stuff
    }
}
