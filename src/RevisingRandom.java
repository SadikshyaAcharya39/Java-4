public class RevisingRandom {
    public static void main(String[] args) {

        /*
        int num = 0;
        switch (num){
            case 1:
                System.out.println("Sunday"); break;
            case 2:
                System.out.println("Monday"); break;
            case 3:
                System.out.println("Tuesday"); break;
            case 4:
                System.out.println("Wednesday"); break;
            case 5:
                System.out.println("Thursday"); break;
            case 6:
                System.out.println("Friday"); break;
            case 7:
                System.out.println("Saturday");break;
            default:
//                throw new RuntimeException();
                System.out.println("Invalid! Try again with different number...");

        }

         */

        // Looping

        // While - when we don't know the number of iterations

//        int num = 3;
//        int i = 1;
//        while(i <= 10){
//            System.out.println(num + " * " + i + " = " + num * i);
//            i++;
//        }

        // Factorial

        /*
        int num = 5;
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

*/
        // Count the digits

        /*

        int num = 123465435;
        int count = 0;
        for(; num != 0; num /= 10){
            count++;
        }
        System.out.println(count);

         */

        // Reversing a digit

        /*

        int num = 12345;
        int reverse = 0;
        for(; num != 0; num /= 10){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);

         */

        // Reversing a digit

        /*

        int num = 234567;
        int reverse = 0;
        for(; num != 0; num /= 10){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println(reverse);

         */

        // Reversing a digit
//        int num = 987654321;
//        int reverse = 0;
//        for(; num!= 0; num /= 10){
//            int remainder = num % 10;
//            reverse = remainder + reverse * 10;
//            System.out.println(reverse);
//        }

        // Count a string
//        String word = "MOM";
//        int count = 0;
//        for(int i = 0; i <= word.length() - 1; i++){
//            count++;
//        }
//        System.out.println(count);

        // Reversing a string

//        String name = "Nepal";
//
//        for(int i = name.length() - 1; i >= 0; i--){
//            System.out.print(name.charAt(i));
//        }


//        String name = "Amir";
//        for(int i = name.length() - 1; i >= 0; i--){
//            System.out.println(name.charAt(i));
//        }

//        char[] array = name.toCharArray();
//        for(int i = array.length - 1; i >= 0; i--){
//            System.out.print(array[i]);
//        }

//        StringBuffer sb1 = new StringBuffer("Amir");
//        sb1.reverse();
//        System.out.println(sb1);

//        StringBuilder sb2 = new StringBuilder("Amir");
//        sb2.reverse();
//        System.out.println(sb2);

        /*

         int originalNum = 121;
         int num = originalNum;
         int reverse = 0;
         for(; num!= 0; num /= 10){
             int remainder = num % 10;
             reverse = reverse * 10 + remainder;
         }
        if(reverse == originalNum){
            System.out.println(originalNum + " is a Palindrome number...");
        }

        else {
            System.out.println(originalNum + " is not a Palindrome number...");
        }

         */

        // Palindrome String

//        String name = "MoM";
//        String originalName = name;
//        String rev = " ";
//        for(int i = name.length() - 1; i >= 0; i--){
//            rev += name.charAt(i);
//        }
//
//        if(name.equalsIgnoreCase(originalName))
//        {
//            System.out.println(name + " is Palindrome");
//        }
//        else
//        {
//            System.out.println(name + " is not Palindrome");
//        }

/*
        String name = "Rotator";
        String originalName = name;
        String rev = "";
        for(int i = name.length() - 1; i >= 0; i--){
            rev += name.charAt(i);
        }

//        rev = name;

        if(name.equals(originalName)){
            System.out.println(name + " is Palindrome");
        }
        else
        {
            System.out.println(name + " is not Palindrome");
        }

 */

        // Fibonacci Series

        /*
        int firstTerm = 1;
        int secondTerm = 2;
        System.out.print(firstTerm + " , " + secondTerm);

        for(int i = 3; i <= 10; i++){
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(" , " + thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

         */

        // Fibonacci Series

//        int firstTerm = 1;
//        int secondTerm = 2;
//        System.out.print(firstTerm + " , "  + secondTerm);
//
//        for(int i = 3; i <= 5; i++){
//            int thirdTerm = firstTerm + secondTerm;
//            System.out.print(" , " + thirdTerm);
//            firstTerm = secondTerm;
//            secondTerm = thirdTerm;
//        }

        // Arm Strong

//        int num = 153;
//        int originalNum = num;
//        int count = 0;
//        int sum = 0;
//
//        for(; num != 0; num /= 10){
//            count++;
//        }
//
//        num = originalNum;
//
//        for(; num != 0; num /= 10){
//            int remainder = num % 10;
//            sum += Math.pow(remainder, count);
//        }
//
//        if(sum == originalNum){
//            System.out.println(originalNum + " is Armstrong number. ");
//        }
//        else
//        {
//            System.out.println(originalNum + " is not an Arm Strong number. ");
//        }


        // Arm Strong number

//        int num = 153;
//        int originalNum = num;
//        int count = 0;
//        int sum = 0;
//
//        for(; num != 0; num /= 10){
//            count++;
//        }
//
//        num = originalNum;
//        for(; num != 0; num /= 10){
//            int remainder = num % 10;
//            sum += Math.pow(remainder, count);
//        }
//
//        if(sum == originalNum){
//            System.out.println(originalNum + " is ArmStrong number");
//        }
//        else
//        {
//            System.out.println(originalNum + " is not an ArmStrong number");
//        }


        int num = 370;
        int originalNum = num;
        int count = 0;
        int sum = 0;

        for(; num != 0; num /= 10){
           count++;
        }

        num = originalNum;
        for(; num!= 0; num /= 10){
            int remainder = num % 10;
            sum += Math.pow(remainder, count);
        }

        if(sum == originalNum){
            System.out.println(originalNum + " is an Arm strong number.");
        }
        else
        {
            System.out.println(originalNum + " is not an Arm strong number.");
        }



    }
}
