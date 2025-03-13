class Manager
{
    int departmentNo = 23;
    String departmentName = "HR";

    void print(){
        System.out.println("Department No: " + departmentNo + " Department Name: " + departmentName);
    }
}

class Worker extends Manager
{
    int departmentNo = 10;
    String departmentName = "Outreach";

    void print(){
        super.print();
        System.out.println("Department No: " + departmentNo + " Department Name: " + departmentName);
    }
}


public class Employees
{
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.print();

        Worker worker = new Worker();
        worker.print();

        Manager worker0 = new Worker();
        worker0.print();

    }
}
