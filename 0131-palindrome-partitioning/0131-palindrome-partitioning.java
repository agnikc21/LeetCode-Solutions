class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(s, new ArrayList<>(), ans, 0);
        return ans;
    }

    private void backtrack(String s, List<String> curr, List<List<String>> ans, int indx){
        if (indx==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        } 

        for (int i = indx+1; i<=s.length();i++ ){
            String str= s.substring(indx,i);
            if (isPali(str)){
                curr.add(str);
                backtrack(s,curr,ans,i);
                curr.remove(curr.size()-1);
            }
        }
    }
    private boolean isPali(String s){
        int l=0;
        int r=s.length()-1;
        while (l<r){
            if (s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}