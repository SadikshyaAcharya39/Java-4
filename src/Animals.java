
// Final Keyword

// Is used to invoke an immediate parent variables and methods.


class Ani
{
    String colour = "white";

    void eat(){
        System.out.println("Eating...");
    }
}


class Dog extends Ani
{
    String colour = "black";

    void displayColour(){
        System.out.println(colour);
        System.out.println(super.colour);
    }


    void eat(){
        System.out.println("Eating meat...");
        super.eat();
    }
}

public class Animals {
    public static void main(String[] args) {
//        Animals ani = new Animals();  Can access the variables and methods of this class

        // To access the value of immediate parent class
        Dog dog = new Dog();
        dog.displayColour(); // we get white instead of black

        dog.eat();

    }
}
