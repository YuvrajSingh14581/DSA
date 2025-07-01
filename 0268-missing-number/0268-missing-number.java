class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=(n*(n+1))/2;
        int actualsum=0;
        for(int i=0;i<nums.length;i++){
            actualsum =actualsum+nums[i];
        }
        int missingno =expectedsum - actualsum;
        return missingno;
    }
}