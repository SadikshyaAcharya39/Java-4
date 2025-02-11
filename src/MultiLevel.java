
class ClassI
{
    int a = 33;

    void m1(){
        System.out.println(a);
    }

}

class ClassII extends ClassI
{
    int b = 3;

    void m2(){
        System.out.println(b);
    }
}

class ClassIII extends ClassII
{
    int c = 9;

    void m3(){
        System.out.println(c);
    }
}


public class MultiLevel {
    public static void main(String[] args) {

        ClassI classI = new ClassI();
        classI.m1();

        ClassII classII = new ClassII();
        classII.m2();

        ClassIII classIII = new ClassIII();
        classIII.m3();

        classIII.m1();
        classIII.m2();
    }
}
