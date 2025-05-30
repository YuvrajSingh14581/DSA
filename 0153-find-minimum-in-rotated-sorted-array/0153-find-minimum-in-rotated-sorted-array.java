class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // int sort =nums[0];
        // return sort;
        // we won't use it because it takes O(nlogn)while binary search takes only O(logn)
        int low=0;
        int high=nums.length-1;
        int ans=nums[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }

        }return ans;
    }
}