class Solution(object):
    def lenLongestFibSubseq(self, arr):
        arr_set = set(arr)
        max_len = 0

        for i in range(len(arr)):
            for j in range(i + 1, len(arr)):
                a, b = arr[i], arr[j]
                length = 2

                while a + b in arr_set:
                    a, b = b, a + b
                    length += 1
                
                max_len = max(max_len, length)
        
        return max_len if max_len > 2 else 0
