public class SumOfDigitsOfNumber
{
    public static void main(String[] args)
    {
        int num = 121;
        int sum = 0;

        for(; num != 0; num /= 10)
        {
            int remainder = num % 10;
           sum +=  remainder;
        }
        System.out.println(sum);
    }
}
