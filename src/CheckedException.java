import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
//    public static void main(String[] args) {
//        System.out.println("Program started...");
//        System.out.println("Program in-progress...");
//
//        try
//        {
//            Thread.sleep(5000);
//        }
//        catch (InterruptedException e){
//            System.out.println("Invalid!");
//        }
//
//        System.out.println("Program finished...");
//        System.out.println("Program exited...");
//    }

//    public static void main(String[] args) throws InterruptedException{
//        System.out.println("Program started...");
//        System.out.println("Program in-progress...");
//
//        Thread.sleep(5000);
//
//        System.out.println("Program finished...");
//        System.out.println("Program exited...");
//    }

    public static void main(String[] args) throws FileNotFoundException, FileNotFoundException {
        FileInputStream file = new FileInputStream("C:\\Text.txt");

    }
}
