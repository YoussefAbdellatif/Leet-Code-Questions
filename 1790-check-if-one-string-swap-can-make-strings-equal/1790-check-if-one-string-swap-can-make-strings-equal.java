class Solution {
 public boolean areAlmostEqual(String s1, String s2) {
    boolean f=false;
    boolean[] v = new boolean[s2.length()];
    boolean a =false;
        int n=0;
    for (int i = 0; i < s2.length(); i++) {
                if (!(s2.charAt(i)==s1.charAt(i))){
                    n++;
                }
            }
    char[] b= s1.toCharArray();
    char[] c = s2.toCharArray();
     Arrays.sort(b);
     Arrays.sort(c);
        if (n == 2 || n==0) {
            f =true;}
        for (int i = 0; i < b.length; i++) {
            if ((b[i]==c[i])){

                v[i] =true;
            }else
                v[i]=false;
        }
        int counter=0;
        for (boolean x:v) {
        if(x){
            counter++;
        }
        if (counter==s2.length())
            a =true;
        }
        if (n == 2 || n==0) {
            f =true;}
        else{
            f= false;
        }








        return f & a;

}}