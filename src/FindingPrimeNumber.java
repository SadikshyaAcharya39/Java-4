public class FindingPrimeNumber {
    public static void main(String[] args) {

//        for(int i = 2; i <= 50; i++){
//            boolean isPrime = true;
//
//            for(int j = 2; j <= i / 2; j++){
//                if(i % j == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                System.out.println(i);
//            }
//        }

        int num = 9;
        boolean isPrime = true;

        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a Prime number.");
        }
        else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}
