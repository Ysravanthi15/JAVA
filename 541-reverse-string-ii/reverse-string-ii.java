class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i += 2 * k) {

            // Reverse from i to i + k - 1 (or end of array)
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
}