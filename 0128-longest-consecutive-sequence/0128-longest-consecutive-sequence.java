class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Arrays.sort(nums);
        int count=1;
        int min=nums[0];
        int max=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==min){
                min=nums[i];
                count++;
            }
            else if(nums[i]!=min){
                count=1;
                min=nums[i];
            }
            max=Math.max(max,count);
        }
        return max;
    }
}