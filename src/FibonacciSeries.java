public class FibonacciSeries {
    public static void main(String[] args) {
        int firstTerm = 1;
        int secondTerm = 2;
        System.out.print(firstTerm + " , " + secondTerm);

        for(int i = 3; i <= 5; i++){
            int thirdTerm = firstTerm + secondTerm;
            System.out.print(" , " +  thirdTerm);
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
