package oops;

class FullTimeEmployee extends employee {
//    double salary;
    public void calculateSalary(){
        salary+=salary*0.5;
    }
}
class InternEmployee extends employee{
    public void calculateSalary(){
        salary+=salary*0.25;
    }
}

public class employee {
    int salary;
    void display(){
        System.out.println("salary is: "+salary);
    }
    public static void main(String[] args) {
        FullTimeEmployee e = new FullTimeEmployee();
        e.salary = 2000;
        InternEmployee i = new InternEmployee();
        i.salary = 2000;
        e.calculateSalary();
        i.calculateSalary();
        e.display();
        i.display();


    }
}
