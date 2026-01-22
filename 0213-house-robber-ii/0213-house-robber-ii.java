class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int ans=Math.max(robbing(nums,0,nums.length-1),robbing(nums,1,nums.length));
        return ans;
    }
    public static int robbing(int[] nums, int start, int end){
        int prev1=0;
        int prev2=0;
        for(int i=start;i<end;i++){
            int pick=nums[i]+prev2;
            int notpick=prev1;
            int curr=Math.max(pick,notpick);
            prev2=prev1;
            prev1=curr;
        }return prev1;
    }
}