class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>();
        for (String b : banned) ban.add(b);
        String cleaned = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
        String[] words = cleaned.split("\\s+");
        Map<String,Integer> freq = new HashMap<>();
        String ans = "";
        int max = 0;
        for (String w : words) {
            if (w.length() == 0 || ban.contains(w)) continue;
            int c = freq.getOrDefault(w, 0) + 1;
            freq.put(w, c);
            if (c > max) {
                max = c;
                ans = w;
            }
        }
        return ans;
    }
}