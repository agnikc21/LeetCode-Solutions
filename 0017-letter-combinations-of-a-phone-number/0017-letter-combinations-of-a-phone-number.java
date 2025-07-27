class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits==null || digits.length()==0) return new ArrayList<>();
        HashMap<Character,String> hmap = new HashMap<>();
        hmap.put('2', "abc");
        hmap.put('3', "def");
        hmap.put('4', "ghi");
        hmap.put('5', "jkl");
        hmap.put('6', "mno");
        hmap.put('7', "pqrs");
        hmap.put('8', "tuv");
        hmap.put('9', "wxyz");

        List<String> ans = new ArrayList<>();
        backtrack(digits,0,new StringBuilder(), ans, hmap);
        return ans;

    }

    public void backtrack(String digits, int indx, StringBuilder temp, List<String> ans, HashMap<Character,String> hmap){
        if (indx == digits.length()){
            ans.add(temp.toString());
            return;
        }

        String letter = hmap.get(digits.charAt(indx));

        for (char c: letter.toCharArray()){
            temp.append(c);
            backtrack(digits,indx+1,temp,ans,hmap);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}