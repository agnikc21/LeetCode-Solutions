class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        backtrack(arr,new String(),0,0,n);
        return arr;
    }
    private void backtrack(List<String> arr, String s, int open, int close, int max){
        if (s.length()==max*2){
            arr.add(s);
            return;
        }
        if (open<max){
            backtrack(arr,s+"(",open+1,close,max);
        }
        if (close<open){
            backtrack(arr,s+")",open,close+1,max);
        }
    }
}