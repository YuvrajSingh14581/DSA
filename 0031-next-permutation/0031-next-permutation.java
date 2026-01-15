class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }if(ind==-1){
            reverse(nums,0,nums.length-1);
            return ;
        }for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                int tmp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=tmp;
                break;
            }
        }
        reverse(nums,ind+1,nums.length-1);
    }
    public void reverse(int[] nums, int left,int right){
        while(left<right){
            int tmp=nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
            left++;right--;
        }
    }
}