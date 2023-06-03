package oops;

import java.util.Arrays;
import java.util.Scanner;

class student{
    String name;
    int rollNo;
    int[] marks = new int[5];

    public student(){
        name = "OM";
        rollNo = 1123545;
        for (int i = 0; i <5; i++){
            marks[i] = 100;
        }
    }

    public void setMarks(int[] marks){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            marks[i]= sc.nextInt();
        }
        this.marks = marks;
    }

    public int[] getMarks(){
        return marks;
    }
}

public class b11rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s = new student();
        System.out.println("Enter name: ");
        s.name = sc.next();
        System.out.println("Enter roll: ");

        s.rollNo = sc.nextInt();
        int[] marks = new int[5];
//        s.setMarks(marks);
        int[] mas = s.getMarks();
        for (int i = 0; i < 5; i++){
            System.out.println(mas[i]+" ");
        }
    }
}