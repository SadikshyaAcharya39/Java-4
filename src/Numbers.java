public class Numbers {
    public static void main(String[] args) {

        // Sum of Even Numbers:

//        int sum = 0;
//        for(int i = 2; i <= 10; i+=2){
//            sum += i;
//        }
//        System.out.println(sum);

        // Factorial of a Number:

//        int factorial = 1;
//        for(int i = 1; i <= 3; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);

        // Prime Numbers between 1 and 100:

//       for(int i = 2; i <= 100; i++) {
//           boolean isPrime = true;
//
//           for (int j = 2; j <= i / 2; j++) {
//               if (i % j == 0) {
//                   isPrime = false;
//                   break;
//               }
//           }
//
//           if (isPrime) {
//               System.out.println(i);
//           }
//       }


//        for(int num = 2; num <= 100; num++){
//            boolean isPrime = true;
//
//            for(int j = 2; j <= num / 2; j++) {
//                if (num % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if(isPrime){
//                    System.out.println(num);
//            }
//        }


        // Write a program to reverse a number (e.g., 1234 should become 4321) using a while loop.

//        int num = 2002;
//        int reverse = 0;
//        while(num != 0){
//            int remainder = num % 10;
//            reverse = reverse * 10 + remainder;
//            num /= 10;
//        }
//        System.out.println(reverse);


        // Reversing a number
//        int num = 4004;
//        int originalNum = num;
//        int reverse = 0;
//        for(; num!= 0; num/= 10){
//            int remainder = num % 10;
//            reverse = reverse * 10 + remainder;
//        }
//
//        num = originalNum;
//
//        if(originalNum == reverse){
//            System.out.println(originalNum + " is Palindrome.");
//        }
//        else
//        {
//            System.out.println(originalNum + " is not Palindrome.");
//        }

//        Sum of Digits of a Number:

        int num = 212;
        int sum = 0;
        for(; num!= 0; num /= 10){
            int remainder = num % 10;
            sum+= remainder;
        }
        System.out.println(sum);


    }
}
