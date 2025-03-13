abstract class AbstractClass
{
     String name = "Sadikshya Acharya";
     int age = 20;

     abstract void study();

}

class Student extends AbstractClass
{
     int graduationYear = 2025;

     void study(){
        System.out.println("Studying all day long !!!");
    }
}

class Second {
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println(myObj.name);
        System.out.println(myObj.age);
        System.out.println(myObj.graduationYear);
        myObj.study();
    }
}
