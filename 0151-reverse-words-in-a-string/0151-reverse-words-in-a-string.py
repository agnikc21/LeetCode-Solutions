class Solution(object):
    def reverseWords(self, s):
        a=s.split()
        ans=""
        for i in range(len(a)-1,0,-1):
            ans+=a[i]+" "
        ans+=a[0]
        return ans
        