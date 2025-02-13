public class MultipleCatchBlocks {
    public static void main(String[] args) {

        String s1 = null;
//        System.out.println(s1.length());  // Null exception
        try
        {
            System.out.println(s1.length());
        }

        /*
        catch (NullPointerException e){
            System.out.println("Null pointer exception ");
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Invalid!");
            System.out.println(e.getMessage());
        }

         */


        // Instead of using every type, we can mention exception only.

        catch (Exception e){
            System.out.println("Invalid !");
            System.out.println(e.getMessage());
        }


    }
}
