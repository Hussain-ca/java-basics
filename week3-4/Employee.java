public class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        if (salary>0)
        {this.salary=salary;}
        else {this.salary=0;}
    }

    double getSalary() {
        return salary;
    }
    void introduce(){
        System.out.println("Hi, my name is "+name);
    }
    void giveRaise(double raise){
        if (raise>0){
            this.salary+=raise;
        }
        else { System.out.println("you did not enter a valid number");}
    }
}
