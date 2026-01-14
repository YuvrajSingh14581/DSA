class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=1;
        int[] ans=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(nums[k]<0){
                ans[j]=nums[k];
                j+=2;
            }else{
                ans[i]=nums[k];
                i+=2;
            }
        }return ans;
    }
}