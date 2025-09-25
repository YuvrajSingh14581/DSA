public class Solution {
    public int SingleNumber(int[] nums) {
        int xor=0;
        foreach(int val in nums){
            xor^=val;
        }return xor;
    }
}