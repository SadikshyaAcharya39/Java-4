import java.lang.reflect.Array;
import java.util.*;

// ArrayList can hold only object type of data. Predefined or user defined object

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        ArrayList<Object> ar = new ArrayList<>();
        ar.add("Sad");
        ar.add("Happy");
        ar.add("Excited");
        System.out.println(ar);

        ar.add("Laugh");
        ar.add(1);
        System.out.println(ar);
        ar.remove(0);
        System.out.println(ar);
        ar.removeAll(ar);
        System.out.println(ar);
*/
        // Declaration

        // ArrayList class object creation
        /*
        ArrayList myList = new ArrayList();
        myList.add(1);
        myList.add("Sad");
        myList.add(20.22);
        System.out.println(myList);
         */

        // List Interface object creation for arraylist
// Allowed

        // List is a parent class. We can store child class object in parent class variable


//        List myList = new ArrayList();
//        myList.add("1");
//        myList.add(1);

        // Declaration
        // ArrayList al = new ArrayList();
        // List myList = new ArrayList();


        // If I want to specify the data type then I need to use a wrapper class.
        // Only allowed integer type of data.

        /*ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        System.out.println(al);
         */

        // If I have a class name Employee. I create many objects but I want to store all the objects value in an single entity then we can specify

//        ArrayList<Employee> al = new ArrayList<Employee>();

//        ArrayList<Double> myList = new ArrayList<Double>();

/*
        ArrayList<Integer> al = new ArrayList<Integer>(5);
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        System.out.println(al);

        */

        // Declaring
        ArrayList myList = new ArrayList();

        // Adding data into ArrayList
        myList.add(100);
        myList.add(200.004);
        myList.add(true);
        myList.add(100);
        myList.add('A');
        myList.add(null);

        // Find the size of the arraylist
        System.out.println("Size of an arraylist: " + myList.size());

        // Print all datas
        System.out.println("Printing data from arraylist: " + myList);  // [100, 200.004, true, 100, A, null]

        // Remove specific element
//        myList.remove(3);
//        System.out.println(myList);  // [100, 200.004, true, A, null]

        // Remove all elements

        /*
        myList.removeAll(myList);
        System.out.println(myList);
        System.out.println(myList.size());
        */

        // Insert elements in the middle  [100, 200.004, true, 100, A, null]
        // Between 100 and 200.004

        myList.add(1, "Sadikshya");
        System.out.println(myList);  // [100, Sadikshya, 200.004, true, 100, A, null]

        // Difference between adding and insertion
        // Add method will add at the end of the list

        // Add value in middle of the list
        // We will use same add method but will provide index number as well.

        // [100, Sadikshya, 200.004, true, 100, A, null]
        // If i want to modify the data then what to do?

        // Modifying element in arrayList, (Change,Replace, Modify)
        myList.set(1, "Java");
        System.out.println(myList); // [100, Java, 200.004, true, 100, A, null]

        // Access a specific element
        System.out.println(myList.get(0));
        System.out.println(myList.get(2));

        // Reading all the elements from arraylist
        // Can use for loop, enhanced loop
        // Iterator

        // By using iterator we can read

        /*
        for(int i = 0; i <= myList.size() - 1; i++){
            System.out.println(myList.get(i));
        }
        */

        /*

        for(Object al:myList){
            System.out.println(al);
        }

        */


        // Using iterator
//        Iterator it = myList.iterator();
//        // Return iterator type of an object
//
//
//        while(it.hasNext()){  // Check element is present or not
//            System.out.println(it.next());
//        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Sad");
        arrayList.add("Happy");
        arrayList.add("Excited");
        arrayList.add("Anxious");
        arrayList.add("Guilty");
        arrayList.add("Amused");
        arrayList.add('A');
        arrayList.add(null);
        arrayList.add(null);

        System.out.println(arrayList);

        arrayList.set(2, "Joyful");
//        arrayList.remove(2);

        // To read specific element
        System.out.println(arrayList.get(2));

        // To read all elements, we can use for loop, enhanced loop and iterator

        // Using iterator
//        Iterator it = arrayList.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        // Removing random elements from arraylist
        ArrayList myList1 = new ArrayList();
        myList1.add(null);
        myList1.add("Amused");
//        myList.removeAll(myList1);
        System.out.println(myList);

        // Clearing everything
        myList.clear();
        System.out.println(myList);







    }
}
