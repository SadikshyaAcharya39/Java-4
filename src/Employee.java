public class Employee {

    // Variables

//    int emp_id;
    int emp_id = 10;
    String emp_name;
    int age;


    // Method
    void display(){
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.emp_id = 20;
        System.out.println(employee.emp_id);
    }

}
