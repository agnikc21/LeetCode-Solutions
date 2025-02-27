class Solution(object):
    def decrypt(self, code, k):
        ncode=[]
        if k==0:
            for i in range(len(code)):
                ncode.append(0)
        
        elif (k>0):
            
            for i in range(len(code)):
                sum=0
                for j in range(k):
                    sum+=code[(i+j+1)%len(code)]
                ncode.append(sum)

        elif (k<0):
            
            for i in range(len(code)):
                sum=0
                for j in range(k,0,1):
                    sum+=code[(i+j)%len(code)]
                ncode.append(sum)
        return ncode    