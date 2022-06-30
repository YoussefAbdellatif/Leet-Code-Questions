class Solution {
   public boolean checkSub(String s, String original) {
        if(original.length()%s.length() ==0){
            int f =original.length()/s.length();
            String r =s;
            for (int i = 0; i < f-1; i++) {
                s= s+r;
            }
            if(s.equals(original)){
                return true;
            }
        }
    return false;
    }

    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <(s.length()/2)+1 ; i++) {
            if(checkSub(s.substring(0,i),s)){
                return true;
            }

        }
        return false;
    }
}