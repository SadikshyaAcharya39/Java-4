//public class JavaConstructor
//{
//
//    // Default constructor
//   int x;
//
//   public JavaConstructor(){
//       x = 5;
//    }
//
//    public static void main(String[] args) {
//        JavaConstructor jc = new JavaConstructor();
//        System.out.println(jc.x);
//    }
//
//}



// Parameterized Constructor

//public class JavaConstructor
//{
//   int x;
//
//   public JavaConstructor(int y){
//       x = y;
//   }
//
//    public static void main(String[] args) {
//        JavaConstructor jc = new JavaConstructor(5);
//        System.out.println(jc.x);
//    }
//
//}

public class JavaConstructor
{

    String name;
    int age;
    String address;

    public JavaConstructor(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString()
    {
        return  " Name: " + name + " " +
                " Age: " +  age + " " +
                " Address: " + address;
    }

    public static void main(String[] args) {
        JavaConstructor jc = new JavaConstructor("Sadikshya", 20, "Godawari");
        JavaConstructor jc1 = new JavaConstructor("Shraddha", 21, "Siphal");
        JavaConstructor jc2 = new JavaConstructor("Amir", 14, "Kupondole");

        System.out.println(jc);
        System.out.println(jc1);
        System.out.println(jc2);

//        System.out.println(jc);
//        System.out.println(jc1);
//        System.out.println(jc2);

    }
}
