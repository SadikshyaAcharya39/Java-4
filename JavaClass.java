public class JavaClass
{

    static void method(){
        System.out.println("Static method can be accessed without creating an object.");
    }

    public void myMethod(){
        System.out.println("Public method can be accessed by creating objects.");
    }

    public static void main(String[] args) {
        method();
        JavaClass jc = new JavaClass();
        jc.myMethod();

    }

}
