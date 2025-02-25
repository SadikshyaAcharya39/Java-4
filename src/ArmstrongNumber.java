public class ArmstrongNumber
{
    public static void main(String[] args)
    {

     int num = 153;
     int originalNum = num;
     int count = 0;
     int sum = 0;

     for(; num != 0; num /= 10)
     {
         count++;
     }

     num = originalNum;
     for(; num != 0; num /= 10)
     {
         int remainder = num % 10;
         sum += Math.pow(remainder, count);
     }

     if(originalNum == sum)
     {
         System.out.println(originalNum + " is an ArmStrong number. ");
     }
     else
     {
         System.out.println(originalNum + " is not an ArmStrong number. ");
     }


    }

}
