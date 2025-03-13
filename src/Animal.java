public class Animal {
    private String name;
    private String colour;
    private int age;

    Animal(String name, String colour, int age){
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    // Getter
    public String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }

    public int getAge(){
        return age;
    }


    // Setter
    public void setName(String name){
        this.name = name;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Pookie", "Black", 2);
        System.out.println(animal.getName());
        System.out.println(animal.getColour());
        System.out.println(animal.getAge());

        animal.setName("Cookie");
        animal.setColour("White");
        animal.setAge(3);

        System.out.println(animal.getName());
        System.out.println(animal.getColour());
        System.out.println(animal.getAge());
    }
}
