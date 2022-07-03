import java.util.Vector;

class Solution {
public int lengthOfLastWord(String s) {
        String[] f=s.split(" ");
        Vector<String> e = new Vector<>();
        for (String v :
                f) {
        e.add(v.trim());
        }
    return  e.lastElement().toCharArray().length;
    }
}