public class Poly {
    int sides;
    String shape_name;

    Poly(int sides, String shape_name){
        this.sides = sides;
        this.shape_name = shape_name;
    }

    void m1(){
        System.out.println("ID: " + sides + " Shape Name: " + shape_name);
    }

    void m1(int sides){
        System.out.println("ID: " + sides);
    }

    void m1(int sides, String shape_name){
        System.out.println("ID: " + sides + " Shape Name: " + shape_name);
    }

    void m1(double sides, String shape_name){
        System.out.println("ID: " + sides + " Shape Name: " + shape_name);
    }

    void m1(String shape_name, int sides){
        System.out.println("Shape name: " + shape_name + "ID: " + sides);
    }

    public static void main(String[] args) {
        Poly poly = new Poly(3, "Triangle");
        poly.m1();
        poly.m1(3);
        poly.m1(4, "Rectangle");
        poly.m1(4.0 , "Rectangle");
        poly.m1("Rectangle", 4);
    }

}
