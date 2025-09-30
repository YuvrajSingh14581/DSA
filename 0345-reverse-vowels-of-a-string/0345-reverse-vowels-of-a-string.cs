public class Solution {
    public string ReverseVowels(string s) {
        int start=0;int end=s.Length-1;
        StringBuilder sb=new StringBuilder(s);
        while(start<=end){
            if(!isVowel(s[start])){
                start++;
            }else if(!isVowel(s[end])){
                end--;
            }else{
                char temp=sb[start];
                sb[start]=sb[end];
                sb[end]=temp;
                start++;end--;
            }
        }return sb.ToString();
    }
    public bool isVowel(char vowel){
        if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'||vowel=='A'||vowel=='E'||vowel=='I'||vowel=='O'||vowel=='U'){
            return true;
        }
        return false;
    }
}