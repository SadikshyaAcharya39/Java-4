public class TypeCasting {
    public static void main(String[] args) {

//        int x = 1000;
//        double myDouble = x;
//        System.out.println(myDouble);
//        System.out.println(((Object) myDouble).getClass().getSimpleName());


//        double myDouble = 100d;
//        System.out.println(myDouble);
//        int myInt = (int) myDouble;
//        System.out.println(myInt);
//        System.out.println(((Object) myInt).getClass().getSimpleName());

        int userScore = 400;
        int totalScore = 500;

//        float percentageOfUserScore = (float) (userScore / totalScore) * 100.0f; // wrong

        // Both are right

        float percentageOfUserScore = (float) userScore / totalScore * 100.0f;

//        float percentageOfUserScore = ((float) userScore / totalScore) * 100.0f;
        System.out.println(percentageOfUserScore);



    }
}
