class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        
        int[] pre = new int[n];
        int[] post = new int[n];
        pre[0] = nums[0];
        post[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            pre[i] = nums[i] + pre[i - 1];
            post[n - i - 1] = nums[n - i - 1] + post[n - i];
        }

        if (post[1] == 0) return 0;
        for (int i = 1; i < n - 1; i++) {
            if (pre[i - 1] == post[i + 1]) return i;
        }
        if (pre[n - 2] == 0) return n - 1;

        return -1;
    }
}