class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > 0) {

                if (bucket[freq[i]] == null) {
                    bucket[freq[i]] = new ArrayList<>();
                }

                bucket[freq[i]].add((char) i);
            }
        }

        char[] ans = new char[s.length()];
        int count = 0;

        for (int i = bucket.length - 1; i >= 0; i--) {

            if (bucket[i] != null) {

                for (char c : bucket[i]) {

                    for (int j = 0; j < i; j++) {
                        ans[count++] = c;
                    }
                }
            }
        }

        return new String(ans);
    }
}