
class Solution {
    public String average(int arr[]) {
        // code here
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double res=(double)sum/n;
        return String.format("%.2f",res);
    }
}