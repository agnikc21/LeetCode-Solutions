class Solution {
    public int maxDepth(String s) {
        char[] c = s.toCharArray();
        int count= 0, maxc=0;
        for (int i =0; i<c.length;i++){
            if(c[i]=='('){
                count++;
                maxc=count>maxc?count:maxc;
            }
            else if(c[i]==')') count--;
        }
        return maxc;
    }
}