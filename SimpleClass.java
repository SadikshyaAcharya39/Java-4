public class SimpleClass
{

    final int x = 10;
    public static void main(String[] args) {
       SimpleClass simpleClass = new SimpleClass();
       // simpleClass.x = 30;
        System.out.println(((Object) simpleClass.x).getClass().getSimpleName());
    }
}
