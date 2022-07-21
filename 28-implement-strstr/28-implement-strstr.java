class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() ==0){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            char[] f= Arrays.copyOfRange(haystack.toCharArray(),i,i+needle.length());
            char[] b=needle.toCharArray();
            if(Arrays.equals(f,b)){
                return i;
            }
        }

        return -1;
    }
}