public class Revising
{
    public static void main(String[] args)
    {

        /*

        // ArmStrong
        int originalNum = 153;
        int num = originalNum;
        int count = 0;
        int sum = 0;

        // Count
        for(; num!= 0; num /= 10){
            count++;
        }

        num = originalNum;

        for(; num!= 0; num/= 10){
            int remainder = num % 10;
            sum += Math.pow(remainder, count);
        }

        if(originalNum == sum)
        {
            System.out.println(originalNum + " is an ArmStrong number.");
        }
        else
        {
            System.out.println(originalNum + " is not an ArmStrong number.");
        }

        */



        // Fibonacci Series

        /*
        int firstTerm = 1;
        int secondTerm = 2;
        System.out.print(firstTerm + " , " +  secondTerm);

        for(int i = 3; i <= 10; i++){
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(" , " + thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

         */

        // Reversing a number


      /*  int num = 4321;
        int originalNum = num;
        int reverse = 0;

        for(; num!= 0; num/= 10){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;

        }

//        System.out.println(reverse);


        if(originalNum == reverse)
        {
            System.out.println(originalNum + " is Palindrome. ");
        }
        else
        {
            System.out.println(originalNum + " is not Palindrome. ");
        }

       */

        // Reversing a String

//        String word = "Noon";
//        String reverse = "";
//
//        for(int i = word.length() - 1; i >= 0; i--){
//            reverse += word.charAt(i);
//        }

//        if condition to check a palindrome

//        String word = "moon";
//        String reverse = "";
//        char[] letter = word.toCharArray();
//
//        for(int i = letter.length - 1; i >= 0; i--){
//            reverse += letter[i];
//        }

        // if condition to check a palindrome


        // Count a String

//        String word = "Nepal";
//        int count = 0;
//        for(int i = 0; i <= word.length() - 1; i++){
//            count++;
//        }
//        System.out.println("Word count is: " + count);


        // Count how many times specific letter is repeated or co- occured.


        /*
        String word = "Hello";
        char letter = 'l';
        int count = 0;

        for(int i = 0; i <= word.length() - 1; i++)
        {
            if(word.charAt(i) == letter){
                count++;
            }

        }
        System.out.println("The letter '" + letter + "' appears " + count + " times in \"" + word + "\".");

         */






    }
}
