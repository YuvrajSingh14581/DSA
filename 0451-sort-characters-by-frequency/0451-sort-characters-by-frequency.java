class Solution {
    public String frequencySort(String s) {
       int[] freq=new int[256];
       for(char c:s.toCharArray()){
        freq[c]++;
       } 
       List<Character>[] list=new ArrayList[s.length()+1];
       for(int i=0;i<freq.length;i++){
        if(freq[i]>0){
            if(list[freq[i]]==null){
                list[freq[i]]=new ArrayList<>();
            }list[freq[i]].add((char)i);
        }
       }
       StringBuilder sb=new StringBuilder();
       for(int i=s.length();i>=0;i--){
        if(list[i]!=null){
            for(char c: list[i]){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
        }
       }return sb.toString();
    }
}