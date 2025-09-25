public class Solution {
    public int FindMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        foreach(int val in nums){
            if(val==1){
                count++;
                max=Math.Max(max,count);
            }else{
                count=0;
            }
        }return max;
    }
}