public class FrogSimulation {

    private int goalDistance, maxHops;

    public FrogSimulation(int dist,int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    //Jumps -10~20
    private int hopDistance(){
        return (int)(Math.random()*31)-10;
    }

    public boolean simulate(){
        String total = "Goal: " + goalDistance + " Hops: ";
        int current = 0;
        int hops = maxHops;
        while(current>-1&&hops!=0){
            int temp = hopDistance();
            total+=temp + " ";

            current+=temp;
            hops--;
            if(current>=goalDistance){
                total+="Success Final Distance: " + current;
                System.out.println(total);
                return true;
            }
        }
        if(current>-1){
            total+="Failed Final Distance: " + current;
        } else {
            total+="Failed Reached Negative Distance";
        }
        System.out.println(total);
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
