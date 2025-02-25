
class FinalM1
{
    int o = 10;

    final void m(){
        System.out.println(o);
    }
}

class FinalM2
{

    // Cannot override

//    final void m(){
//        System.out.println(o * o);
//    }
}

public class FinalMethod {

    public static void main(String[] args) {
        FinalM1 fm = new FinalM1();
        fm.m();

    }
}
