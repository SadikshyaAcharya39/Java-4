public class ReverseNum {
    public static void main(String[] args) {

        int num = 2345;
        int reverse = 0;

        for(; num != 0; num /= 10){
            int remainder = num % 10;
            reverse = remainder + reverse * 10;
        }
        System.out.println(reverse);

    }
}
