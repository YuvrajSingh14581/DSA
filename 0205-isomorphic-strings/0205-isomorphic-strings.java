class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
           if(!map.containsKey(s.charAt(i))){
            if(set.add(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }else return false;
           }else{
            if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
           }
        }return true;
    }
}