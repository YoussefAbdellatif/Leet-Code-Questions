import java.util.Vector;

class Solution {
      public String mergeAlternately(String word1, String word2) {
      char[] one=  word1.toCharArray();
      char[] two = word2.toCharArray();
      Vector<Character> vector= new Vector<Character>();
      int count1=0;
      int count2=0;
      int diff= one.length-two.length;
      char[] result= new char[word1.length()+word2.length()];
        for (int i = 0; i < result.length; i++) {
            if (i< word1.length()){
                vector.add(one[i]);}
                if (i<word2.length()){
            vector.add(two[i]);}

        }
        String b = "";
        for (int i = 0; i < vector.size(); i++) {
            b+= vector.get(i);
        }
        return b;
        }
}