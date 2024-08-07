class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long y=0;
        long temp=x;
        while (temp>0){
            y*=10;
            y+=temp%10;
            temp=temp/10;
        }
        return y==x;
    }   
    
};