class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int end  = intervals[0][1];
        for (int[] i: intervals){
            if (i[0]<end) res++;
            else{
                end=i[1];
            }
        }
        return res-1;
    }
}