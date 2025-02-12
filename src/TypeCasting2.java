public class TypeCasting2 {
    public static void main(String[] args) {
//        int num = 100;
//        float num1 = (float) num;
//        System.out.println(num1);

        // We cannot convert from char to String

        /*

        char char1 = 'A';
        String s1 = (String) char1;
        System.out.println(s1);

         */

        // Widening Casting
        // byte-short-character-int-long-float-double

        // Narrowing Casting
        // double-float-long-int-char-short-byte


        int userScore = 300;
        int maxScore = 500;
        float percentage = (float) userScore/ maxScore * 100f;
        System.out.println(percentage);


    }
}
