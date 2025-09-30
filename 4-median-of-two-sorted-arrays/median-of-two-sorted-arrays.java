class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int len = n + m;
        
        int mid1 = (len - 1) / 2;  
        int mid2 = len / 2;

        int i = 0, j = 0, count = 0;
        int curr = 0, prev = 0;

        while (count <= mid2) {
            prev = curr;
            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }
            count++;
        }
        if (len % 2 == 1) {
            return curr;
        }
        return (prev + curr) / 2.0;
    }
}
