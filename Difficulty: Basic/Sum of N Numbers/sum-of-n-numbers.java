class Solution {
    public static int nSum(int n) {
        // code here
        int count=0;
        for(int i=1;i<=n;i++){
            count+=i;
        }
        return count;
    }
}
