class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] Ans=new int[nums.length];
        Ans[0]=1;
        for(int i=1;i<nums.length ;i++){
            Ans[i]=Ans[i-1]*nums[i-1];
        }int suffix=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix*=nums[i+1];
            Ans[i]*=suffix;
        }
        return Ans;
    }
}