class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=first(nums,target);
        int y=last(nums,target);
        return new int[]{x,y};
    }
    public int first(int[] nums, int z){
        int left=0;
        int right=nums.length-1;
        int x=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==z){
                x=mid;
                right=mid-1;
            }else if(nums[mid]<z){
                left=mid+1;
            }else right=mid-1;
        }return x;
    }
    public int last(int[] nums,int z){
        int left=0;
        int right=nums.length-1;
        int y=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==z){
                y=mid;
                left=mid+1;
            }else if(nums[mid]>z){
                right=mid-1;
            }else left=mid+1;
        }return y;
    }
}