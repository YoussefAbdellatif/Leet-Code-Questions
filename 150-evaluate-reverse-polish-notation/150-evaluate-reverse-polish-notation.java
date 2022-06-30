class Solution {
  public int evalRPN(String[] tokens) {
        Stack<Integer> f = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")){
            f.push(f.pop()+f.pop());
            }else if(tokens[i].equals( "-")){
                int sub =f.pop();
                f.push(f.pop()-sub);
            }else if(tokens[i].equals( "/")){
                int div= f.pop();
                f.push(f.pop()/div);
            }else if(tokens[i].equals("*")){
                f.push(f.pop()*f.pop());
            }
            else{
          
                    f.push(Integer.parseInt(tokens[i]));

            }
        }
        return f.peek();
    }
}