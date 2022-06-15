class Solution {
        private int sumOfElements(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
    return sum;
    }

    public int maximumWealth(int[][] accounts) {
        int temp=0;

        for (int i = 0; i < accounts.length; i++) {
            if (sumOfElements(accounts[i]) >temp){
                temp = sumOfElements(accounts[i]);
            }
        }
        return temp;
    }
}