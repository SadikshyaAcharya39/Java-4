public class Palindrome
{
    public static void main(String[] args)
    {
     int num = 1001;
     int reverse = 0;
     int originalNum = num;

     for(; num != 0; num /= 10)
     {
         int remainder = num % 10;
         reverse = remainder + reverse * 10;
     }

     num = originalNum;

     if(originalNum == reverse)
     {
         System.out.println(originalNum + " is an Palindrome number. ");
     }
     else
     {
         System.out.println(originalNum + " is not an Palindrome number. " );
     }

    }
}
