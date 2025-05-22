class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> cmap = new HashMap<>();
        for (char c : s.toCharArray()) {
            cmap.put(c, cmap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> charList = new ArrayList<>(cmap.entrySet());
        charList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder str = new StringBuilder();
        for (var entry : charList) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                str.append(c);
            }
        }

        return str.toString();
    }
}