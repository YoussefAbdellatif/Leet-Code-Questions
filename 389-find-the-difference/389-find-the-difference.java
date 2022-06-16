import java.util.Arrays;

class Solution {
 public char findTheDifference(String s, String t) {
     
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum += s.codePointAt(i);
        }
        int sumT=0;
        for(int i=0;i<t.length();i++){
            sumT += t.codePointAt(i);
        }
        int f = sumT-sum;

       

        return  Character.toString(f).toCharArray()[0] ;

    }}