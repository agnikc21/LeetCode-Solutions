class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i:nums1){
            ans.add(i);
        }
        for(int i:nums2){
            ans.add(i);
        }
        int len = nums1.length+nums2.length;
        Collections.sort(ans);
        if (len%2==0){
            return (double) (ans.get(len/2) +ans.get((len/2)-1))/2;
        }
        return (double) ans.get(len/2);

    }
}