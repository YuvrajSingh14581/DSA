class Solution {
    public int minimumCost(int[] nums) {
        int score=nums[0];
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                secMin=min;
                min=nums[i];
            }else if(nums[i]<secMin)secMin=nums[i];
        }score+=min+secMin;
        return score;
    }
}