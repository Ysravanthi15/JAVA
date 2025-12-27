class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        // Your code here
        Collections.sort(arr);
        int n=arr.size();
        return arr.get(n-1);
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        // Your code here
        Collections.sort(arr);
        return arr.get(0);
    }
}
