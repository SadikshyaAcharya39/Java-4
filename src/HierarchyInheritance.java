// One parent has multiple child class

// Hierarchy Inheritance

class ClassE1
{
//    String name;

//    void m1(String name){
//        System.out.println(name);
//    }

    String m1(String name){
        return name;
    }
}

class ClassE2 extends ClassE1
{

    String name1 = "Sadikshya";

    void m2(){
        System.out.println(name1);
    }
}


class ClassE3 extends ClassE1
{
    String name2 = "Prabesh";

    void m3(){
        System.out.println(name2);
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        ClassE1 classE1 = new ClassE1();

        // When we use return

//        System.out.println(classE1.m1("Amir"));

        String name = classE1.m1("Amir");
        System.out.println(name);

        ClassE2 classE2 = new ClassE2();
        System.out.println(classE2.m1("Sadikshya"));
        classE2.m2();
//
        ClassE3 classE3 = new ClassE3();
        System.out.println(classE3.m1("Anju"));
        classE3.m3();
    }
}
