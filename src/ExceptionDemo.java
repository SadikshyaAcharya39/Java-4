import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        // Unchecked Exception

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try
        {
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        sc.close();
         */

        // Un Checked Exception

// Example 1

        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(100/num);  // Arithmetic Exception

         */

        // Example 2

        /*

        int arr[] = {10, 20, 90, 12, 2, 1, 3, 4,4};
        System.out.println(arr[9]);
        // ArrayIndexOutOfBoundsException

         */

        // Example 3:

        /*
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int arr1 = sc.nextInt();
//        System.out.print(arr1);

        System.out.println("Enter a second number: ");
        int arr2 = sc.nextInt();
//        System.out.println(" , " + arr2);

        System.out.println("Enter a third number: ");
        int arr3 = sc.nextInt();
//        System.out.println(" , " + arr3);

        System.out.println("Enter a forth number: ");
        int arr4 = sc.nextInt();
//        System.out.println(" , " + arr4);

        System.out.println("Enter a fifth number: ");
        int arr5 = sc.nextInt();
        System.out.println(arr1 + " , " + arr2 + " , " + arr3 + " , " + arr4 + " , " + arr5);
        System.out.println(arr[1]);

         */

//        int a[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a position from 0-4: ");
//        int pos = sc.nextInt();
//
//        System.out.println("Enter a value: ");
//        int value = sc.nextInt();
//        a[pos] = value;  // ArrayOutOfBoundException
//
//        System.out.println(a[pos]);

        // Example

//        String s = "12345";
//        int num = Integer.parseInt(s);  // Number format exception
//        System.out.println(num);


        // Example:

//        String s = null;
//        System.out.println(s.length());   // Null pointer exception


        // Will throw an exception when user enter invalid username and password or blank username and blank passowrd.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//
//        try
//        {
//            System.out.println(100 / num);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Invalid data!");
//        }


//        int arr[] = {10, 20, 30, 11, 22, 0};
//        try
//        {
//            System.out.println(arr[9]);
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Out of bound! Try Again!");
//        }

        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a position from [0-3]: ");
        int pos = sc.nextInt();
        System.out.println("Enter a value");
        int value = sc.nextInt();

        try
        {
            arr[pos] = value;
            System.out.println(arr[pos]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Invalid!");
        }
        sc.close();











    }
}
