class Solution {
    public static void arrayTraversalReverse(int[] arr) {
        // Code here
        String ans=" ";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        System.out.print(ans);
    }
}
