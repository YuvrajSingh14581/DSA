class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int prefix=1;
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }if(suffix==0){
                suffix=1;
            }
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }return max;
    }
}