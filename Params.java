public class Params {

    void m1(String fname){
        System.out.println(fname);
    }

    void m2(int age){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Params params = new Params();
        params.m1("Sadikshya Acharya");
        params.m1("Anju Acharya");
        params.m1("Amir Acharya");


//        params.m2(20);
    }
}
