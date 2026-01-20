class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        combinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void combinations(int i, int[] nums, int tar, List<List<Integer>> ans,ArrayList<Integer> ds){
        if(i==nums.length){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }return;
        }
        if(nums[i]<=tar){
            ds.add(nums[i]);
            combinations(i,nums,tar-nums[i],ans,ds);
            ds.remove(ds.size()-1);
        }
        combinations(i+1,nums,tar,ans,ds);
    }
}