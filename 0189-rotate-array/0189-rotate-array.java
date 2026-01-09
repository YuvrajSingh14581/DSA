class Solution {
    public void reverse(int[] arr,int left,int right){
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int d=n-k;
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
        reverse(nums,0,n-1);
    }
}