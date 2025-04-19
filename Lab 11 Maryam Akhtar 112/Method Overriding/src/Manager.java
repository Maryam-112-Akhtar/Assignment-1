public class Manager extends Employee{

    double calculateSalary(){
        return 80000 ;
    }

    public void display(){
        System.out.println("Manager Salary : " + calculateSalary());
    }

}
