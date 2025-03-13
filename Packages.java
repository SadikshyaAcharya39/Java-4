import java.util.Scanner;

public class Packages
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number < 18){
            System.out.println(number + " : You're not allowed...");
        }
        else
        {
            System.out.println(number + " : You're allowed...");
        }
//        System.out.println("User entered: " + number);

    }

}
