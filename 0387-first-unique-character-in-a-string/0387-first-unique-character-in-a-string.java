class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0)return -1;
        int[] freq=new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1)return i;
        }return -1;
    }
}