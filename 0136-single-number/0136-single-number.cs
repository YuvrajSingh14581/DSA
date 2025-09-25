public class Solution {
    public int SingleNumber(int[] nums) {
         Dictionary<int,int>map=new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
           if(map.ContainsKey(nums[i])){
            map[nums[i]]++;
           }else{
            map.Add(nums[i],1);
           }
        }
        foreach(var val in map){
            if(val.Value==1){
                return val.Key;
            }
        }
        return -1;
    }
}