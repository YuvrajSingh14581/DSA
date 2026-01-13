class Solution {
    public int majorityElement(int[] nums) {
        int count=0;int el=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count++;
                el=nums[i];
            }else if(nums[i]==el){
                count++;
            }else count--;
        }int countMax=0;
        for(int n:nums){
            if(n==el) countMax++;
        }if(countMax>nums.length/2)return el;
        return -1;
    }
}