class Solution {
    public int searchInsert(int[] arr, int t) {
        int s = 0, e = arr.length - 1;
  
        if(t < arr[s])return s;
        if(t > arr[e])return e+1;

        while (s < e){
            int mid = (s + e)/2;
            if(arr[mid] >= t){
                e = mid - 1;
            }
            if(arr[mid] < t){
                s = mid + 1;
            }
        }
        return arr[s] < t? s + 1 : s;
    }
}