class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int ab=Math.abs(nums[i%nums.length]-nums[(i+1)%nums.length]);
            ans=Math.max(ans,ab);
        }return ans;
    }
}