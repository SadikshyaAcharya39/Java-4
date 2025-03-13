
// Multi Level Inheritance

class A
{
    String name = "A";
    String animal = "Animal";

    void displayAnimal1(){
        System.out.println(animal);
    }
}

class B extends A
{
    String name = "B";
    String animal = "Buffalo";

    void displayAnimal2(){
        System.out.println(super.animal);
    }
}

class C extends B
{
    String name = "C";
    String animal = "Cat";

    void displayAnimal3(){
        System.out.println(animal);
    }
}

public class TypeCasting1 {
    public static void main(String[] args) {
//        A a = new A();
//        System.out.println(a.name);
//        a.displayAnimal1();

//        B b = new B();
//        System.out.println(b.name);
//        System.out.println(b.animal);
//        b.displayAnimal2();
//        b.displayAnimal1();

//        C c = new C();
//        System.out.println(c.animal);
//        System.out.println(c.name);
//        c.displayAnimal3();

        // Up Casting
        A a = new C();  // Child is assigned to parent
        a.displayAnimal1();

        // Down Casting
        // Parent is assigned to child

        B b = (B) a;


        /*

        In Automation, this concept is used:

        WebDriver driver = new ChromeDriver();  // Up casting

        ChromeDriver chromeDriver = (ChromeDriver) driver; // Down casting

        String driver = "Chrome";
        switch(driver)
        {
        case: "Chrome"
        driver = driver.ChromeDriver();
        break;

        case: "FireFox"
        driver = driver.FireFox();
        break;

        case: "Edge"
        driver = driver.Edge();
        }
        else
        {
        System.out.println()
        }

         */

        C c = (C) b;
        System.out.println(c.name);
        System.out.println(c.animal);
        c.displayAnimal3();
        c.displayAnimal1();
        c.displayAnimal2();
    }
}
