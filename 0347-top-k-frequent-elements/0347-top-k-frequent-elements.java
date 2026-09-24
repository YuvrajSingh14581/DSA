class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] list=new ArrayList[nums.length+1];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key: map.keySet()){
            int i=map.get(key);
            if(list[i]==null){
                list[i]=new ArrayList<>();
            }list[i].add(key);
        }
        int[] res=new int[k];
        int count=0;
        for(int i=list.length-1;i>=0&& count<k;i--){
            if(list[i]!=null){
                for(int j:list[i]){
                    res[count++]=j;
                }
            }
        }return res;
    }
}