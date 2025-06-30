class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hmap= new HashMap<>();
        for (String word: strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String ans = new String(arr);
            if (!hmap.containsKey(ans)){
                hmap.put(ans,new ArrayList<String>());
            }
            hmap.get(ans).add(word);
        } 
        List<List<String>> anagrams= new ArrayList<>();
        for (String str : hmap.keySet()){
            anagrams.add(hmap.get(str));
        }
        return anagrams;
    }
}