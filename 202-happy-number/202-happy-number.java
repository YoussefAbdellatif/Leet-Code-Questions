import java.util.Vector;

class Solution {
        private int[] getDigits(int input) {
        int i = 0;
        int[] arr = new int[12];
        while (input > 0) {

            while (input > 0) {
                arr[i] = input % 10;
                i++;
                input = input / 10;

            }

        }
        return arr;
    }

       public boolean isHappy(int n) {
        int[] arr = getDigits(n);
        int sum =0;
        int counter = 0;
        boolean isHappy =false;
        Vector<Integer> f= new Vector<>();

        while (arr.length !=0){
            if (counter>0){
                arr=getDigits(sum);
                sum=0;
            }
            for (int i = 0; i < arr.length; i++) {
                sum+= Math.pow(arr[i],2);
            }
            if (f.contains(sum)){
                break;
            }
            if(sum ==1)
            {isHappy =true;
                break;
            }else{
                f.add(sum);}


        counter++;
        }
        return isHappy;
    }

}