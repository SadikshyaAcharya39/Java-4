public class StringRelated
{
    public static void main(String[] args)
    {

//        String name = "noon";
//        for(int i = name.length() - 1; i >= 0; i--)
//        {
//            System.out.print(name.charAt(i));
//        }


        String name = "Noon";
        String reverse = "";

        for(int i = name.length() - 1; i >= 0; i--){
          reverse += name.charAt(i);
        }

        if(name.equalsIgnoreCase(reverse))
        {
            System.out.println(name + " is Palindrome.");
        }
        else
        {
            System.out.println(name + " is not Palindrome. ");
        }

    }
}
