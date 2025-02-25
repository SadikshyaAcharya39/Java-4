public class CountVowelsAndConsonants
{
    public static void main(String[] args)
    {

        /*


      char[] vowels= {'a', 'e', 'i', 'o', 'u'};
      boolean isVowel;

      String name = "amir";
      char[] nameToArray = name.toCharArray();

      for(int i = 0; i <= nameToArray.length - 1; i++)
      {
          isVowel = true;

          if(nameToArray[i] == vowels[i])
          {
              isVowel = true;
              break;
          }

          if(isVowel)
          {
              System.out.println(nameToArray[i] + " is vowel. ");
          }
          else
          {
              System.out.println(nameToArray[i] + " is a consonant. ");
          }
      }

      */

        String name = "Sadikshya";

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] nameToArray = name.toLowerCase().toCharArray();

        for(int i = 0; i <= nameToArray.length- 1; i++)
        {

            if(nameToArray[i] == vowels[i])
            {
                boolean isVowel = false;

            }
            else
            {
                System.out.println(nameToArray[i] + " is consonant. ");
            }

        }


    }
}
