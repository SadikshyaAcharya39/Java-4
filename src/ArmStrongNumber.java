public class ArmStrongNumber {
    public static void main(String[] args) {

        // 1 5 3 -- power 3 add each with power 3

//        int num = 153;
//        int originalNum = num;
//        int sum = 0;
//        int count = 0;
//
//        for(; num!= 0; num /= 10){
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
//        if(sum == originalNum)
//        {
//            System.out.println(originalNum + " is an ArmStrong Number.");
//        }
//        else {
//            System.out.println(originalNum + " is not an Arm String Number.");
//        }

// Counting a number

//        int num = 340;
//        int count = 0;
//
//        for(; num != 0; num /= 10){
//            count++;
//        }
//        System.out.println(count);


        /*
        // Arm Strong Number
        int num = 153;
        int count = 0;
        int sum = 0;
        int originalNum = num;

        for(; num!= 0; num /= 10){
            count++;
        }

        num = originalNum;

        for(; num!= 0; num/= 10){
            int remainder = num % 10;
            sum+= Math.pow(remainder, count);
        }

        if(originalNum == sum)
        {
            System.out.println(originalNum + " is an Arm Strong Number.");
        }
        else
        {
            System.out.println(originalNum + " is not an ArmStrong Number.");
        }

         */

        /*
        // Fibonacci Series

        int firstTerm = 1;
        int secondTerm = 2;
        System.out.print(firstTerm + " , " + secondTerm);

        for(int i = 3; i <= 5; i++){
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(" , " + thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

         */


        // Fibonacci Series

//        int firstTerm = 1;
//        int secondTerm = 2;
//        System.out.print(firstTerm + " , " + secondTerm);
//
//        for(int i = 3; i <= 8; i++){
//            int thirdTerm = firstTerm + secondTerm;
//            System.out.print(" , "  + thirdTerm);
//            firstTerm = secondTerm;
//            secondTerm = thirdTerm;
//        }



    }
}
