public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1= new Employee("Ali",25,-1000);
        Employee employee2= new Employee("Sara",30,90000);

        employee1.introduce();
        System.out.println(employee1.getSalary());
        employee1.giveRaise(-5000);
        System.out.println(employee1.getSalary());
        employee1.giveRaise(5000);
        System.out.println(employee1.getSalary());

    }
}
