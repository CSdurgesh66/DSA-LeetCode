class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] nums = new int[n+m];
        int left =0;
        int right =0;
        int i=0;
        while(left!=n&& right!=m){
            if(nums1[left]<nums2[right]){
                nums[i++] = nums1[left++];
            }
            else{
                nums[i++] = nums2[right++];
            }
        }
        while(left!=n){
            nums[i++] = nums1[left++];
        }
        while(right!=m){
            nums[i++] = nums2[right++];
        }

        int len = nums.length;
        if((len & 1)==1){
            return nums[len/2];
        }

        return (nums[len/2]+nums[(len/2)-1])/2.0;
    }
}