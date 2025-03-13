public class JavaMethods {

        // Method types

        /*

        Built-in Method: length, subString, index.Of, charAt
        Pre-defined Method:

        No parameters    No return value
        No parameters    Return Value
        Take parameters  No return value
        Take parameters  Return value

         */

        void m1(){
            System.out.println("This is a pre-defined method! Does not take any parameters and does not return value. ");
        }

        static int m2(){
            return 3;
        }

        void m3(int a, int b){
            System.out.println(a + b);
        }

        int m4(int c, int d){
            return c + d;
        }

    public static void main(String[] args) {

        JavaMethods jm = new JavaMethods();
        jm.m1();

        System.out.println(m2());
//
//        int result2 = jm.m2();
//        System.out.println(result2);
//
        jm.m3(3, 6);
//
//        int result3 = jm.m4(10, 20);
//        System.out.println(result3);


//        JavaMethods jm = new JavaMethods();
//        jm.m1();
//        jm.m1();
//        jm.m1();

        }
}
