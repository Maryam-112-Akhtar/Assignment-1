public class Worker extends Employee {

    double calculateSalary(){
        return 50000;
    }

    public void display() {
        System.out.println("Worker Salary : " + calculateSalary());
    }
}
