import javax.sql.rowset.spi.SyncResolver;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {


        // Declaring hashmap

        HashMap myMap = new HashMap();
        myMap.put(101.0, 1);
        myMap.put(102, 2);

        Map myHashMap = new HashMap();

        /*
        Rules:
        1. Heterogeneous data - allowed
        2. Duplication - not allowed
        3. Does not follow indexing concept
        4. Multiple null values not allowed only single null is allowed.

         */
        // Key-Value Combination
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nepal", 977);
        hashMap.put("India" , 91);
        hashMap.put("Nepal", 977);
        hashMap.put("USA", 1);
//        hashMap.put(null, null);
        hashMap.put("Philippines", 63);

        // Change thr value
        hashMap.put("Nepal", 988);
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//        System.out.println(hashMap);

//        hashMap.remove("Nepal", 977);
//        System.out.println(hashMap);

//        System.out.println(hashMap.size());

        // Removing key removes both keys and values

//        hashMap.remove("India");
//        System.out.println(hashMap);

        // access value of a key
        System.out.println(hashMap.get("Nepal"));

        // get all the keys from hashmap
//        for(String x: hashMap.keySet()){
//            System.out.println(x);
//        }

        // return keys only values only
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());

        // Return keys along with the values
        System.out.println(hashMap.entrySet());

        // Accessing a specific element
        /*

        Iterator it = hashMap.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Iterator it1 = hashMap.values().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

         */

        // Reading elements using loop
//        for(Object x: hashMap.entrySet()){
//            System.out.println(x);
//        }

        // Iterator
        Iterator it = hashMap.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
