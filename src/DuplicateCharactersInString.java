import java.util.HashMap;

public class DuplicateCharactersInString
{
    public static void main(String[] args)
    {

      /*
        String name = "sadikshya";
      char ch = 's';
      int count = 0;

      for(int i = 0; i <= name.length() - 1; i++){
          if(name.charAt(i) == ch)
          {
             count++;
          }
      }

        System.out.println(ch + " is repeated "  + count + " times .");

       */

        String name = "sadikshya";
        char[] nameArray = name.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for(int i = 0; i <= nameArray.length - 1; i++){
            char ch = nameArray[i];
            charCount.put(ch, charCount.getOrDefault(ch,0) + 1);
        }

        for(char key :charCount.keySet())
        {
            System.out.println(key + " is repeated " + charCount.get(key) + " times .");
        }

    }
}
