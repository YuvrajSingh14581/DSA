class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int d=n-k;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=nums[i];
        }
        for(int i=d;i<n;i++){
            nums[i-d]=nums[i];
        }
        for(int i=n-d;i<n;i++){
            nums[i]=temp[i-(n-d)];
        }
    }
}