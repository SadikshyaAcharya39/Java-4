
class Parent {

    // Final Variable
//    int x = 10;

    final int x = 10;

    final void m() {
        System.out.println("This is a method...");
    }

}


final class Child extends Parent
{
    int a = 20;

    // Cannot override a final method

//    final void m(){
//        System.out.println("This is a method...");
//    }

}

// Final Class Example

//class Child2 extends Child // cannot extend a  final class
//{
//
//}

public class Final {
    public static void main(String[] args) {

        // Normal Variable

//        Parent parent = new Parent();
//        parent.x = 11;
//        System.out.println(parent.x);

        // Final Variable

        Parent parent = new Parent();
//        parent.x = 11;  Cannot change the value of the variable
//        System.out.println(parent.x);


        // Final - variables, methods, class



    }
}
