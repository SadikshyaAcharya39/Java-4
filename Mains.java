class Animal
{
    protected String colour = "White";

    void print(){
        System.out.println(colour);
    }
}

class Cat extends Animal
{
    protected String colour = "Brown";

    void show(){
        System.out.println(colour);
    }

}

class Dog extends Animal
{
    protected String colour = "Black";
    void printColour(){
        System.out.println(colour);
    }
}

public class Mains
{
    public static void main(String[] args) {

        // Brown
//        Animal cat = new Cat();
//        System.out.println(cat.colour);
//        cat.show();

        // White
        Animal animal = new Animal();
        System.out.println(animal.colour);
        animal.print();

        // Brown
        Cat cat = new Cat();
        System.out.println(cat.colour);
        cat.show();

        // Black
        Dog dog = new Dog();
        System.out.println(dog.colour);
        dog.printColour();

    }
}
