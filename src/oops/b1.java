package oops;

import java.util.Scanner;

class stident{
    String name;
    int prn;
    int[] marks;

    public void setMarks(int[] marks){
        Scanner sc =  new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            marks[i] = sc.nextInt();
        }
        this.marks = marks;
    }
    public int[] getMarks(){
//        for (int i : marks){
//            System.out.print(i+" ");
//        }
        return marks;
    }
    public void average(){
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += marks[i];
        }
        int avg = sum/5;
        System.out.println("Average of marks is: "+avg);
    }
}

public class b1 {
    public static void main(String[] args) {
        stident s = new stident();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of student: ");
        s.name = sc.next();
        System.out.println("Enter prn: ");
        s.prn =sc.nextInt();
        System.out.println("Marks of student: ");
        int[] maks =new int[5];
        s.setMarks(maks);
        s.average();
//        int[] mar = s.getMarks();
//        for (int i =0; i < mar.length; i++){
//            System.out.print(mar[i]+" ");
//        }
    }
}