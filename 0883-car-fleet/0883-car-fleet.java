class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<List<Double>> time = new ArrayList<>();
        for (int i=0;i<speed.length;i++){
            time.add((Arrays.asList((double) position[i], (double)(target-position[i])/speed[i])));
        }
        Collections.sort(time, Comparator.comparingDouble(a -> ((List<Double>)a).get(0)).reversed());
        int fleet=0;
        double par = 0;
        for (int i=0;i<speed.length;i++){
            double t = time.get(i).get(1);
            System.out.println(t);
            if (t>par){
                fleet++;
                par=t;
            }
        }
        return fleet;
    }
}