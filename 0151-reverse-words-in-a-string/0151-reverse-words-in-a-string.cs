public class Solution {
    public string ReverseWords(string s) {
        s=s.Trim();
        string [] word=s.Split(' ', StringSplitOptions.RemoveEmptyEntries);
        Array.Reverse(word);
        string rev=string.Join(" ", word);
        return rev;
    }
}