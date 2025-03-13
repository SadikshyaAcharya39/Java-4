import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {

        // String
        // char - 2 bytes
        // float - 4 bytes
        // boolean - 1 bit
        // double - 8 bytes
        // int - 4 bytes
        // short - 2 bytes
//        String name = "Sadikshya";
//        System.out.println(name);


//        String name = "John";
//        System.out.println("Hello" + " " + name);

        String name1 = "Sadikshya";
        String name2 = "Acharya";
        String fullName = name1.concat( " " + name2);
        System.out.println(fullName);

        boolean javaIsFun = true;
        System.out.println(javaIsFun);



        /*


        int x = 5;
        int y = 6;
        int z = 7;
        System.out.println(x + y + z);

         */

//       int x = 5, y = 6, z = 7;
//       System.out.println(x + y + z);


//        int x , y , z;
//        x = y = z = 10;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        String _name = "AMIR";
//        System.out.println(_name);

//        String $name = "Sadikshya";
//        System.out.println($name);

       /*


        int a = 20;
        int b = 30;
        a = a + b ;  // 20 + 30 = 50
        b = a - b;  // 50 - 30 = 20
        System.out.println(b);
        // b = 20
        a = a - b;   // 50 - 30 = 30
        System.out.println(a);

        */


        // Calculating the area of rectangle

        int area = 81;
        int length = 1;
        int breadth = 9;
        area = length * breadth;
        System.out.println(area);

    }
}
