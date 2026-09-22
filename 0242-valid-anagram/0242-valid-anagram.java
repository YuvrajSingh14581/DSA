class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-'a']+=1;
        }
        int j=0;
        while(j<freq1.length||j<freq2.length){
            if(freq1[j]!=freq2[j])return false;
            j++;
        }
        return true;
    }
}