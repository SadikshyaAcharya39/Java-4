public class Professor {
//    static String name;
//    static int pro_id;
//    static int age;
//    static int departmentNo;


      String name = "Sadikshya";
     static int pro_id = 1;
     static int age = 20;
     static int departmentNo = 101;

     static void display(){
//         System.out.println(name);
         System.out.println(pro_id);
//         System.out.println(age);
//         System.out.println(departmentNo);
     }

     // Non-static method can access everything directly.

     void show(){
         System.out.println(name);
         System.out.println(pro_id);
     }

    public static void main(String[] args) {
        display();
//        System.out.println(name);
//        System.out.println(pro_id);
        System.out.println(age);
        System.out.println(departmentNo);

        Professor professor = new Professor();
        System.out.println(professor.name);

//        professor.name = "Sadikshya";
//        System.out.println(Professor.name);
//        professor.pro_id = 1;
//        System.out.println(Professor.pro_id);
//        professor.age = 20;
//        System.out.println(Professor.age);
//        professor.departmentNo = 101;
//        System.out.println(Professor.departmentNo);

    }
}
