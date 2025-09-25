class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=(n*(n+1))/2;
        int actualsum=0;
        for(int i: nums){
            actualsum +=i;
        }
        int missingno =expectedsum - actualsum;
        return missingno;
    }
}