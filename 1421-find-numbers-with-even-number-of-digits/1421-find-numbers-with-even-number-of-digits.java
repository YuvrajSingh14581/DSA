class Solution {
    public int findNumbers(int[] nums) {
        int i=0,j=0,count=0;
        while(i<=nums.length-1){
            String x= String.valueOf(nums[i]);
            if(x.length() %2==0){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}