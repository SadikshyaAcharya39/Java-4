import java.util.ArrayList;
import java.util.Iterator;

public class RevisingArrayList {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(20);
        arrayList.add("Sadikshya");
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add(200.0);
        arrayList.add(null);
        arrayList.add(null);
//        System.out.println("Before removal: " + arrayList);


        //        arrayList.remove(null);
//        System.out.println(arrayList);

//        ArrayList arr = new ArrayList();
//        arr.add(null);
//        arr.add('A');

//        arrayList.removeAll(arr);
//        System.out.println("After removal: " + arrayList);


        // Iterator
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(Object arList: arrayList){
            System.out.println(arList);
        }

    }
}
