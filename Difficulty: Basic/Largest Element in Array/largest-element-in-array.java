class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n= arr[arr.length-1];
        return n;
    }
}
