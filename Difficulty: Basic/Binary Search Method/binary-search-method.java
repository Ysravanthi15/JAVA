// User function Template for Java
class Solution {
    public static int binarySearchArray(int arr[], int k) {
        // Your code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]<k){
                low++;
                
            }
            else if(arr[mid]>k){
                high--;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}