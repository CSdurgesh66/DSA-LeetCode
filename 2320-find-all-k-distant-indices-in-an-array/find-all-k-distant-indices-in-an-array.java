class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                q.add(i);
            }
        }
        System.out.println(q);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!q.isEmpty()) {
                int idx = q.peek();
                int diff = Math.abs(i - idx);
                if (diff <= k) {
                    ans.add(i);
                } else if (i > idx && diff > k) {
                    q.poll();
                    if(!q.isEmpty()){
                        idx = q.peek();
                    diff = Math.abs(i - idx);
                    if (diff <= k)
                        ans.add(i);
                    }
                     
                }
            }
        }
        return ans;
    }
}