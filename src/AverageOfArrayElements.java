public class AverageOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int sum = 0;

        int average = 0;

        for(int i = 0; i <= arr.length - 1; i++){
            sum += arr[i];
            average = sum / arr.length;
        }

        
        for(int x: arr) {
            sum += x;
            int length = arr.length;
            sum += x;
            average = sum / length;
        }

        System.out.println(average);

        // Finding smallest element in an array

        int lowestElement = arr[0];
        for(int lowest: arr){
            if(lowestElement >= lowest){
                lowestElement = lowest;
            }
        }
        System.out.println("Lowest Element: " + lowestElement);


        int highestElement = arr[0];
        for(int highest: arr){
            if(highestElement <= highest){
                highestElement = highest;
            }
        }
        System.out.println(highestElement);
    }
}
