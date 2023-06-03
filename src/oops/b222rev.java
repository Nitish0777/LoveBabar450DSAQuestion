package oops;

class employeee{
    double salary;
    String name;
    public void displaySalary(){
        System.out.println("Name of Full time Employee "+name);
        System.out.println("Salary of Full time Employee "+salary);
    }
}

class FulltimeEmp extends employeee {
//    public double salary = 1000;

    FulltimeEmp(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(){
        salary += (0.50*salary);
    }
}

class InternEmp extends employeee {
    InternEmp(String n,double salary){
        this.name = n;
        this.salary = salary;
    }
    public void calculateSalary(){
        salary += (0.25*salary);
    }
}

public class b222rev {
    public static void main(String[] args) {
        FulltimeEmp e1 = new FulltimeEmp("Suresh",1000);
        InternEmp e2 = new InternEmp("Nitish",1000);
        e1.calculateSalary();
        e1.displaySalary();
        e2.calculateSalary();
        e2.displaySalary();

    }
}
