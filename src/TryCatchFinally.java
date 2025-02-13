public class TryCatchFinally {
    public static void main(String[] args) {

//        String s = null;
//        try
//        {
//            System.out.println(s.length());
//        }
//        catch (Exception e)
//        {
//            System.out.println("Invalid!");
//        }
//        finally
//        {
//            System.out.println("Entered into finally block...");
//        }

//        String s = null;
//        try
//        {
//            System.out.println(s.length());
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("Invalid!");
//        }
//        finally
//        {
//            System.out.println("Entered into finally block...");
//        }

        String s = "welcome";
        try
        {
            System.out.println(s.length());
        }
        catch (Exception e)
        {
            System.out.println("Invalid!");
        }
        finally
        {
            System.out.println("Entered into finally block...");
        }
    }
}
