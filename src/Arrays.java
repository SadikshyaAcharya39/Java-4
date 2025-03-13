public class Arrays
{
    public static void main(String[] args) {

//        String[] cars = {"BMW", "Volvo", "Toyota", "Ferrari", "Tesla"};

//        for(String car: cars){
//            System.out.println(car);
//        }

//        System.out.println(cars[0]);

//        cars[0] = "Ford";
//        System.out.println(cars.length);
//        System.out.println(cars[0]);


//        for(int i = 0; i <= cars.length - 1; i++){
//            System.out.println(cars[i]);
//        }

//        int ages[] = {10, 20, 30, 40, 50, 60, 70};
//        int lowestAge = ages[0];
//        for(int i = 0; i < ages.length; i++){
//            if(lowestAge >= ages[i]){
//                ages[i] = lowestAge;
//            }
//        }
//        System.out.println(lowestAge);


//        int ages[] = {10, 20, 30, 40, 50, 60, 70};
//        int highestAge = ages[0];
//        for(int i = 0; i < ages.length; i++){
//            if(highestAge <= ages[i]){
//                highestAge = ages[i];
//            }
//        }
//
//        System.out.println(highestAge);


//        int[] ages = {30, 80, 100, 70, 60, 50, 40, 10};
//        int highestAge = ages[0];
//
//        for(int i = 0; i < ages.length; i++){
//            if(ages[i] >= highestAge){
//                highestAge = ages[i];
//            }
//        }
//
//        System.out.println(highestAge);


        int[] ages = {30, 80, 100, 70, 60, 50, 40, 10};
        int sum = 0;

        for(int i = 0; i < ages.length; i++){
            sum += ages[i];
        }

        int length = ages.length;
        int average = sum / length;
        System.out.println(average);






    }
}
