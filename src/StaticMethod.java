
class StaticM
{

    // Static variable
    static int x = 10;


    // static method
    static void m(){
        System.out.println("This is a static method...");
    }

    void m2(){
        System.out.println(x);
        m();
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Static Variable
        System.out.println(StaticM.x);

        // Changing the value of static variable
        StaticM.x = 0;
        System.out.println(StaticM.x);

        StaticM.m();
        StaticM staticMethod= new StaticM();
        staticMethod.m2();







    }
}
