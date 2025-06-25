class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        for (int i: nums){
            if (!hset.contains(i)) hset.add(i);
            else return i;
        }
        return -1;
    }
}