class Solution:
    def isValid(self, s: str) -> bool:
        arr=[]
        arro=['(','{','[']
        arrc=[')','}',']']
        for i in range(len(s)):
            if (s[i] in arro):
                arr.append(s[i])
            if(s[i] in arrc):
                k=arrc.index(s[i])
                if arr:
                    if(arr[-1]==arro[k]):
                        arr.pop()
                        continue
                    else:
                        return False
                else:
                    return False
        if not arr:
            return True
        