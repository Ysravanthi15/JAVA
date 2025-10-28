class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            c[index++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            c[index++] = nums2[i];
        }
        Arrays.sort(c);
        double median;
        int n = c.length;
        if (n % 2 == 0) {
            median = (c[n/2 - 1] + c[n/2]) / 2.0;
            return median;

        } else {
            median = c[n/2];
            return median;
        }

    }
}