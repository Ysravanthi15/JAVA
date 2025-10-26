class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
            
        }
        return count;
    }
}