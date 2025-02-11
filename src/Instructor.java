import java.lang.constant.Constable;

public class Instructor {
    int ins_id;
    String ins_name;
    int ins_age;

    // Default constructor
    Instructor(){
         this.ins_id = 0;
        this.ins_name = " ";
        this.ins_age = 0;
    }

    // Parameterized constructor

    Instructor(int ins_id, String ins_name, int ins_age){
        this.ins_id = ins_id;
        this.ins_name = ins_name;
        this.ins_age = ins_age;
    }

    public void display(){
        System.out.println(ins_id + " " + ins_name + " "  +ins_age);
    }

    public static void main(String[] args) {
        Instructor instructor0 = new Instructor();
        Instructor instructor1 = new Instructor(01, "Sadikshya", 20);
        instructor0.display();
        instructor1.display();
    }
}
