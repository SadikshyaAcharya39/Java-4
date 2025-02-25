public class SwappingTwoNumbersWithoutThirdVariable {
    public static void main(String[] args) {

        /*
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping: ");
        System.out.println("Value of B is: " + b);
        System.out.println("Value of A is: " + a);

         */

//         a = a + b;  // a = 30
//         b = a - b; // b = 30 - 20 = 10
//        System.out.println("After swapping: ");
//        System.out.println("Value of B is: " + b);
//         a = a - b;
//        System.out.println("Value of A is: " + a);

        // After using third variable

     /*

        int c;
        c  = a;
        a = b;
        System.out.println(a + " Value of a");
        b = c;
        System.out.println(b + " Value of b");

      */


// Factorial Number

        int num = 5;
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);


    }
}
