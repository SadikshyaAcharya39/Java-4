
// Single Level Inheritance

// One parent, one child

class Class1
{
    int x = 10;

    void m(){
        System.out.println(x * x);
    }

}

class Class2 extends Class1
{
    int y = 3;

    // Method overriding
    void m(){
        System.out.println(y);
    }

    void m1(){
        System.out.println(y * y);
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
//       Class1 class1 = new Class1();
//        System.out.println(class1.x);
//        class1.m();

        Class2 class2 = new Class2();
        System.out.println(class2.x);
        System.out.println(class2.y);
        class2.m1();
    }
}
