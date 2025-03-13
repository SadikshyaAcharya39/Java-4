

// having many forms
// Can achieve polymorphism through overloading

public class Box {


    double width, height, depth;

    // Constructor Overloading

    Box(){  // Default Constructor
        width=height=depth = 0;
    }

    Box(double len){  // Parameterized Constructor
       width=height=depth=len;
    }

    double volume(){
        return width*depth*height;
    }

    public static void main(String[] args) {
        Box box = new Box(10.0);
        System.out.println(box.volume());

    }
}
