package oops;

interface MotorBike{
    int speed = 50;
    int totalDistance();
}
interface cycle{
    int time = 2;
}

class TwoWheller implements MotorBike,cycle{
    public int totalDistance(){
        return speed*time;
    }
}

public class motor {
    public static void main(String[] args) {
        TwoWheller t = new TwoWheller();
        System.out.println("Total Distance Travelled "+t.totalDistance());
    }
}
