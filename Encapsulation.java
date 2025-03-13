import java.util.ArrayList;
import java.util.LinkedList;

public class Encapsulation
{
    private String name;
    private int age;
    private String address;

    // Parameterized Constructor

    /*

    public Encapsulation(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString()
    {
        return
                " Name: " + name +
                " Age: " + age +
                " Address: "  + address
                ;

    }

    public static void main(String[] args) {
        Encapsulation encapsulation1 = new Encapsulation("Sadikshya", 20, "Lalitpur");
        System.out.println(encapsulation1);


        encapsulation1.setName("Amir");
        encapsulation1.setAge(20);
        encapsulation1.setAddress("Lalitpur");
        System.out.println(encapsulation1.getName());
        System.out.println(encapsulation1.getAge());
        System.out.println(encapsulation1.getAddress());

     }
     */

    // Default Constructor

    public Encapsulation(){

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return  age;
    }

    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return "Name: " + name +
                " Age: " + age +
                " Address: " + address;
    }


    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Sadikshya");
        encapsulation.setAge(20);
        encapsulation.setAddress("Lalitpur");

        System.out.println(encapsulation);

        encapsulation.setName("Shraddha");
        encapsulation.setAge(22);
        encapsulation.setAddress("Lalitpur");
        System.out.println(encapsulation);



//        System.out.println(encapsulation.getName());
//        System.out.println(encapsulation.getAge());
//        System.out.println(encapsulation.getAddress());

//        LinkedList<Integer> values = new LinkedList<Integer>();

//        ArrayList<Integer> value = new ArrayList<>();


    }
}
