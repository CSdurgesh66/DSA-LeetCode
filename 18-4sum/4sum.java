class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i],nums[j], nums[left], nums[right]));
                        set.add(list);
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else
                        right--;
                }
            }

        }
        for (List<Integer> l : set) {
            ans.add(l);
        }
        return ans;
    }
}