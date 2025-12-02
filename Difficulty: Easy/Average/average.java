class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
            {
                sum+=arr[i];
            }
            if (arr[i] >= 0) count++;
            
        }
        if (count == 0) return 0.0;   // avoids divide-by-zero

        return (double) sum / count;
    }
}
