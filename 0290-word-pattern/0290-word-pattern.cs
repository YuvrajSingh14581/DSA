public class Solution {
    public bool WordPattern(string pattern, string s) {
        string[] arr=s.Split(' ');
        if(pattern.Length!=arr.Length){
                return false;
        }
        Dictionary<char,string> map=new Dictionary<char,string>();
        for(int i=0; i<pattern.Length;i++){
           char p=pattern[i];
           string word=arr[i];
           if(map.ContainsKey(p)){
            if(map[p]!=word){
                return false;
            }
           }else {
            if(map.ContainsValue(word))return false;
            map[p]=word;
           }
        }return true;
    }
}