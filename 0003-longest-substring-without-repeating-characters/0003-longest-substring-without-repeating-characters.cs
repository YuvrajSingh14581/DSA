public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int start=0;int end=0; int maxLen=0;
        List<char> list=new List<char>();
        while(end<s.Length){
            if(!list.Contains(s[end])){
                list.Add(s[end]);
                maxLen=Math.Max(maxLen,list.Count);
                end++;
            }else{
                list.Remove(s[start]);
                start++;
            }
        }
        return maxLen;
    }
}