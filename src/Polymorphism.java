public class Polymorphism {

    void method1(){
        System.out.println("This is a method");
    }

    void method1(int x, int y){
        System.out.println("Sum: " + (x + y));
    }

    void method1(double x, double y){
        System.out.println("Sum: " + (x + y));
    }

    void method1(int y, double x){
        System.out.println("Sum: " + (y + x));
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.method1();
        polymorphism.method1(2, 3);
        polymorphism.method1(2.2, 3.2);
        polymorphism.method1(5, 10.0);
    }
}
