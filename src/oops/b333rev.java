package oops;

interface MootorBike{
    int speed = 60;
    int totalDistance();
}

interface cyylce{
    int time = 3;
}

class TwooiWheler implements MootorBike,cyylce {
    public int totalDistance(){
        return speed*time;
    }
}

public class b333rev {
    public static void main(String[] args) {
        TwooiWheler t = new TwooiWheler();
        int siatance = t.totalDistance();
        System.out.println("Total distance: "+siatance );
    }
}
