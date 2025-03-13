public class Students
{
    private String name;
    private int age;
    private String address;


    public Students(String name, int age, String address){
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

    public String toString(){
        return "Name: " + name +
                ", Age: " + age +
                ", Address: " + address;
    }

    public static void main(String[] args) {
       Students students0 = new Students("Sadikshya", 20, "Lalitpur");
//       System.out.println(students0);

       students0.setName("Amir");
       students0.setAge(14);
       students0.setAddress("Lalitpur");

        System.out.println(students0);

       Students students1 = new Students("Amit", 40, "Lalitpur");
       System.out.println(students1);
    }
}
