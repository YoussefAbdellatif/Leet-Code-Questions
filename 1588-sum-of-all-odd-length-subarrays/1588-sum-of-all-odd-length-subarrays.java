import java.util.Vector;

class Solution {
        private int sumOfElementsInArray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
    return sum;
    }

public int sumOddLengthSubarrays(int[] arr) {
        Vector<int[]> vector= new Vector<>();
        int  odd =0;
        for (int i = 0;i<arr.length ; i++) {
              odd =i;
         while((odd - i) <=arr.length-1) {
             if((odd < arr.length)){
                 vector.add(Arrays.copyOfRange(arr, i, odd+1)) ;}
                 odd += 2;

         }
            }
        int sum =0;
        for (int[] g: vector ){
         sum+=   sumOfElementsInArray(g);
        }
        return sum;
        }
}