public class Student {
    int stu_id;
//    String stu_name;
    String stu_name = "Sadikshya Acharya"; // Only assign if the name is same for other object
    int stu_age;


    void printData(){
        System.out.println(stu_id + " " + stu_name+ " " + stu_age);
    }
}
