import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
    public static void main(String[] args)
    {

        /*
        Rules:
        1. Heterogenous data is allowed
        2. Duplication not allowed.
        3. Does not follow indexing
        4. Multiple nulls not allowed. Only single null is allowed.
         */

        HashSet mySet = new HashSet();
        mySet.add("Sad");
        mySet.add(101);
        mySet.add('A');
        mySet.add('A');
//        mySet.add(null);
//        mySet.add(null);
        mySet.add(20.04);

        // Printing the data
        System.out.println(mySet);

        // Cannot access a specific element directly
        // Can access after converting hashset into arraylist.

        ArrayList arr = new ArrayList(mySet);
        for(int i = 0; i <= arr.size() - 1; i++){
            System.out.println(arr.get(i));
        }

        // Accessing a specific element
        System.out.println(arr.get(1));


        // Cannot use for-loop for reading the elements because it does not follow index concept.
        // Cannot modify or insert the elements because it does not follow indexing concept.
        // Because for inserting we need to provide index number

        // Removing specific element
        System.out.println("Before removing:  "  + mySet);
        mySet.remove(101);
//        mySet.remove("null");
        System.out.println("After removing: " + mySet);

        // Reading elements using for loop
//        for(Object set: mySet){
//            System.out.println(set);
//        }

        // Reading elements using iterator

//        Iterator it = mySet.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        // Removing everything
//         mySet.clear();


        /*

        HashSet myset2 = new HashSet();
        myset2.add("Sad");
        mySet.removeAll(myset2);
        System.out.println(mySet);

        */

        System.out.println(mySet.size());


        mySet.clear();
//        System.out.println(mySet);

// Optional
//        Iterator<Object> it = mySet.iterator();


        // Is empty or not
        System.out.println(mySet.isEmpty());
    }
}
