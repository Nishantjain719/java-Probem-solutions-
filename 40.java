
/* indexOf() method returns the index of the first occurrence of the character(s) in the string, or -1 if it never occurs
String myStr = "Hello planet earth, you are a great planet.";
System.out.println(myStr.indexOf("planet")); 6 
input: ['flower', 'flow', 'flight'] output: 'fl'*/

class Solutin38 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
