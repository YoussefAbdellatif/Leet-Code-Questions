import java.util.Arrays;

class Solution {
 public char findTheDifference(String s, String t) {
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum += s.codePointAt(i);
        }
        int sumT=0;
        for(int i=0;i<t.length();i++){
            sumT += t.codePointAt(i);
        }
        int f = sumT-sum;

        Arrays.sort(one);
        char v = '1';
        Arrays.sort(two);
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (two[i] == one[j]) {
                    one[j] = 0;
                    break;
                } else {
                    v = two[i];
                }
            }
        }

        return  Character.toString(f).toCharArray()[0] ;

    }}