public class Car {

    public void fullThrottle(){
        System.out.println("Car is going as fast as it can!");
    }

    public void printSpeed(int speed){
        System.out.println("Speed: "  + speed + "m.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.printSpeed(60);

    }
}
