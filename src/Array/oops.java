package Array;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }
}

public class oops {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "Blue";
        pen.type = "ball";

        System.out.println(pen.color + " "+pen.type+" pen");
        pen.write();
    }
}
