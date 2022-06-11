class Solution {
public:
   int hammingWeight(uint32_t n) {
      int m =0;
        while (n>0){

            m+= (n&1);
            n>>=1;
        }

        return m;
    }
};