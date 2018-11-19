public class FrogSimulation {

    private int goalDistance, maxHops;

    public FrogSimulation(int dist,int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance(){
        return (int)(Math.random()*11);
    }

    public boolean simulate(){
        int current = goalDistance;
        int hops = maxHops;
        while(goalDistance>=current&&hops!=0){
            current-=hopDistance();
            hops--;
            if(current<=0){
                return true;
            }
        }
        return false;
    }

    public double runSimulations(int num){
        int pass = 0;
        for(int i=0;i<num;i++){
            if (simulate()) {
                pass++;
            }
        }
        return (double)pass/num;
    }
}
