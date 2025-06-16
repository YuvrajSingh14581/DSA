class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                ans=Math.max(ans,nums[i]-nums[j]);
                if(ans==0){
                    ans=-1;
                }
            }
        }
        return ans;
    }
}