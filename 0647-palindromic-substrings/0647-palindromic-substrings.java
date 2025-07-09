class Solution { 
    int count =0;
    void helper(int i,int j,String s){
        while (i>=0 && j<s.length()&& s.charAt(i)== s.charAt(j)){
            count++;
            i--;
            j++;
        }
    }
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            helper(i,i,s);
            helper(i,i+1,s);
        }
        return count;
    }
}