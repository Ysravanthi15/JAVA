class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (j == 0) arr[0] = i; // first position
                arr[1] = i;             // keep updating last position
                j++;
            }
        }

        return arr;

    }
}