// User function Template for Java
class Solution {
    public static int minimumVerticalSum(ArrayList<ArrayList<Integer>> arr) {
        // Your code here
        int maxCols = 0;
        for (ArrayList<Integer> list : arr) {
            maxCols = Math.max(maxCols, list.size());
        }

        // Array to store vertical sums
        int[] sums = new int[maxCols];

        // Calculate vertical sums
        for (ArrayList<Integer> list : arr) {
            for (int i = 0; i < list.size(); i++) {
                sums[i] += list.get(i);
            }
        }

        // Find minimum vertical sum
        int min = Integer.MAX_VALUE;
        for (int val : sums) {
            min = Math.min(min, val);
        }

        return min;
    }
}