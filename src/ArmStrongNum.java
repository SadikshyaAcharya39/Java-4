public class ArmStrongNum {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;

        // count, pow (count) , +

        int count = 0;
        int sum = 0;
        for(; num != 0; num /= 10)
        {
           count++;
        }

        num = originalNum;

        for(; num != 0; num /= 10){
            int remainder = num % 10;
            sum += Math.pow(remainder, count);
        }

        if(originalNum == sum){
            System.out.println(num + " is an ArmStrong Number. ");
        }
        else
        {
            System.out.println(num + " is not an ArmStrong Number. ");
        }
    }
}
