public class Person {
    private String firstName;
    private  String lastName;
    private int age;
    private String address;


    Person(String firstName, String lastName, int age, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    // Get methods

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    // Set Methods

    public void setFirstName(String fn){
        firstName = fn;
    }

    public void setLastName(String ln){
        lastName =ln;
    }

    public void setAge(int age){
        this.age= age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "firstName: " + firstName +
                ",  lastName: " + lastName +
                ",  age: " + age +
                ",  address: " + address;


    }

}
