import java.util.Vector;

class Solution {
   public String interpret(String command) {
        char[] q= command.toCharArray();
        Vector<Character> vector = new Vector<Character>();
        for (int i = 0; i < command.length(); i++) {
            if (q[i] == 'G'){
                vector.add('G');
            }
            if(q[i] == '(' && q[i+1] == ')'){
                vector.add('o');
            }
            if(q[i] == '(' && q[i+1] == 'a' && q[i+2] == 'l' && q[i+3] ==')'){
                vector.add('a');
                vector.add('l');
            }
            
        }
        String b = "";
        for (int v = 0; v < vector.size(); v++) {
            b+= vector.get(v);
        }
        return b;
    }
}