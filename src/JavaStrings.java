import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {

//      String name = " Sadikshya ";
//      System.out.println(name.length());
//      name = name.trim();
//      System.out.println(name.length());
//      System.out.println(name.charAt(0));
//      System.out.println(name.toUpperCase());
//      System.out.println(name.toLowerCase());
//        System.out.println(name.concat(" Acharya"));
//        System.out.println(name + " Acharya");
//        System.out.println(name.contains("shya"));
//        System.out.println(name.indexOf("a"));
//
//        System.out.println(name == "Sadikshya");
//        System.out.println(name.equals("Sadikshya"));
//
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(0, 3)); // Sad ikshya

//        System.out.println(name.replace("a", "o"));
//        System.out.println(name.replaceAll("Sadikshya", "Amir"));
//        System.out.println(name.replaceFirst("s", "e"));


//        String data = "apple,ball,cat";
//        String[] fruits = data.split(",");
//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }

//        String email = "acharya.sadikshya33@gmail.com";
//        String[] splittedEmail = email.split("@");
//        for(String splitEmail : splittedEmail){
//            System.out.println(splitEmail);
//
//        }


//        String name = "Sadikshya";
//        System.out.println(name.startsWith("Sa"));
//        System.out.println(name.endsWith("ya"));
//        System.out.println(name.lastIndexOf("a"));
//        System.out.println(name.indexOf("a"));

//        System.out.println(name.equalsIgnoreCase("sadikshya"));

//        String s1 = "Hello";
//        String s2 = "Hello";
//        System.out.println(s1 == s2); // true
//        System.out.println(s1.equals(s2)); // true
//
//        String s3 = s1;
//        System.out.println(s1 == s3); // true
//        System.out.println(s1.equals(s3)); // true
//
//        String s4 = new String("Hello");
//        String s5 = new String("Hello");
//        System.out.println(s4 == s5); // false
//        System.out.println(s4.equals(s5)); // true


        String name = "Sadikshya";
//        String fullName = String.join(" ", name,"Acharya");
//        System.out.println(fullName);

//        System.out.println(name.isBlank());
//        System.out.println(name.isEmpty());

//        char[] letter = name.toCharArray();
////        System.out.println(letter[0]);
//
//        for(char letters: letter){
//            System.out.println(letters);
//        }


        // String formatting

//        String formatted = String.format("Hello, %s!  You have %d messages.", "Sadikshya", 5);
//        System.out.println(formatted);


//        String formatted = String.format("Hello, I'm %s Acharya. I'm %d years old. " , "Sadikshya", 20);
//        System.out.println(formatted);


//        System.out.println("Hi! ".repeat(3));


//        int num = 20;
//        String str = String.valueOf(num);
//        System.out.println(str);


//        String s1 = " Sadikshya";
//        s1.trim();
//        System.out.println(s1.length());

//        String s2 = new String(" Sadikshya");
//        s2.trim();
//        System.out.println(s2.length());

//        int num = 20;
//        String num2 = "30";
//        System.out.println(num + num2);

//        String num3 = "10";
//        String num4 = "20";
//        System.out.println(num3 + num4);


//        String word = "\"Nepal\" is a beautiful country. " ;
//        System.out.println(word);

//        String word2 = "It\'s a good day!";
//        System.out.println(word2);

//        System.out.println(Math.max(20, 30));

//        System.out.println(Math.min(30, 20));

//        System.out.println(Math.sqrt(81));

//        int x = 9;
//        int y = 10;
//        System.out.println(x > y);

//        System.out.println(10 > 9);


//        int x = 10;
//        System.out.println(x == 10);

//        int day = 1;
//        switch(day){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid!");
//
//        }

//        String day = "Monday";
//        switch(day){
//            case "Sunday":
//                System.out.println("First day of a week!");
//                break;
//            case "Monday":
//                System.out.println("Second day of a week!");
//                break;
//            case "Tuesday":
//                    System.out.println("Third day of a week!");
//                    break;
//            case "Wednesday":
//                System.out.println("Fourth day of a week!");
//                break;
//            case "Thursday":
//                System.out.println("Fifth day of a week!");
//                break;
//            case "Friday":
//                System.out.println("Sixth day of a week!");
//                break;
//            case "Saturday":
//                System.out.println("Seventh day of a week!");
//                break;
//            default:
//                System.out.println("Invalid!");
//        }


//        int age = 10;
//        if(age < 18){
//            System.out.println("Not eligible to vote!");
//        }
//        else if (age >= 90){
//            System.out.println("Not eligible to vote!");
//        }
//        else
//        {
//            System.out.println("Eligible to vote!");
//        }

        // Ternary Operator
//        int age = 100;
//        String result  =  (age < 18 || age >= 100) ? "Not eligible to vote." : "Eligible to vote";
//        System.out.println(result);

//        int day = 1;
//        String result = (day < 0 || day > 7) ? "Invalid!" :
//                (day == 1) ? "Sunday":
//                        (day == 2) ? "Monday":
//                                (day == 3) ? "Tuesday":
//                                        (day == 4) ? "Wednesday":
//                                                (day == 5) ? "Thursday":
//                                                        (day == 6) ? "Friday":
//                                                                "Saturday";
//
//        System.out.println(result);

/*
        int age = 20;
        String result = (age < 20 || age > 80) ? "Invalid" : "Valid!";
        System.out.println(result);

        int correctCode = 4444;
        int attempts = 0;

        Scanner sc = new Scanner(System.in);

        while (attempts < 3){
            System.out.println("Enter code: ");
            int code = sc.nextInt();

            if (code == correctCode) {
                System.out.println("Door is open!");
                return; // Exit the program if correct
            } else {
                attempts++;
            }
        }

        // If the user has failed 3 times
        System.out.println("Door is locked!");
        sc.close();

 */

//        int num = 0;
//        if(num > 0){
//            System.out.println(num + " is a positive number. ");
//        }
//        else if( num < 0){
//            System.out.println(num + " is a negative number. ");
//        }
//        else{
//            System.out.println(num + " is zero. ");
//        }


        int num = 0;
        if(num == 0)
        {
            System.out.println(num + " is neither odd nor even number. ");
        }
        else if( num % 2 == 0)
        {
            System.out.println(num + " is an even number. ");
        }
        else
        {
            System.out.println(num + " is an odd number. ");
        }

    }
}
