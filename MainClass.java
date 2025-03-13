class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 20;
    }
}


public class MainClass {
    public static void main(String[] args) {
//       InnerClass ic = new InnerClass();
//        System.out.println(ic.y);

//        OuterClass oc = new OuterClass();
//        System.out.println(oc.x);


        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
