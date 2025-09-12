class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void rightPosition(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                swap(arr,i-1,i);
            }
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = 0;
        int x = 0;
        while(i<m && x<n){
            if(nums1[i]<=nums2[x]){
                i++;
            }else if(nums1[i]>nums2[x]) {
                int temp=nums1[i];
                nums1[i] = nums2[x];
                nums2[x] = temp;
                i++;
                rightPosition(nums2);
            }
        }
        
        while(i<nums1.length && x<n){
            nums1[i++] = nums2[x++];
        }
    }
}