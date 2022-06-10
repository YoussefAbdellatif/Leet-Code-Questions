class Solution {
           public double getAverage (int[] x){
        double sum = 0;
        int n =0;
        for (int i = 0; i < x.length; i++) {
        sum = sum + x[i];
        if (x[i] ==0)
            n++;
        }
        return sum/(x.length-n);
    }

    public double average(int[] salary) {
          int min = Arrays.stream(salary).min().getAsInt();
          int  max = Arrays.stream(salary).max().getAsInt();
         int[] sorted= Arrays.stream(salary).sorted().toArray();
         sorted[0]= 0;
        sorted[salary.length-1]=0;


        return getAverage(sorted);
        }
        }
