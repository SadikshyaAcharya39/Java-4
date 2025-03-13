public class Main {

    static int x = 30;

    static void m1() {
        System.out.println("This is a static method!!!");
    }
}

class Main1 extends Main{
    static void m1(){
        System.out.println("We can't override static method...");
    }
}


class MainMethod {
    public static void main(String[] args) {
        System.out.println(Main.x);
        Main main = new Main();
        main.m1();

        Main1 main1 = new Main1();
        main1.m1();

        Main main2 = new Main1();
        main2.m1();   // Can't override

    }
}