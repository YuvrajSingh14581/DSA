class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public static void combinations(int ind,int[] nums,int target,List<List<Integer>> ans,ArrayList<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1])continue;
            if(nums[i]>target)break;
            list.add(nums[i]);
            combinations(i+1,nums,target-nums[i],ans,list);
            list.remove(list.size()-1);
        }
    }
}