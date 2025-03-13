public class MethodOverloading
{

    // No. of parameters

    int myMethod(int x){
        return x;
    }

    int myMethod(int x, int y){
        return x + y;
    }

    // Data type of parameters

    double myMethod(double x){
        return x;
    }

    // Order of parameters

    void myMethod(double y, int x){
        System.out.println(x + y);
    }

    public static void main(String[] args) {
    MethodOverloading methodOverloading = new MethodOverloading();

    int result1 = methodOverloading.myMethod(3);
    System.out.println(result1);


    System.out.println(methodOverloading.myMethod(3));
    System.out.println(methodOverloading.myMethod(3,3));
    System.out.println(methodOverloading.myMethod(3d));
    methodOverloading.myMethod(30d, 20);


    }
}
