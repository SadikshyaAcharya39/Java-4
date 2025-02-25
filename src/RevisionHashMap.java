import java.util.HashMap;

public class RevisionHashMap {
    public static void main(String[] args) {
      HashMap hashMap = new HashMap();
      hashMap.put(1, "Sadikshya");
      hashMap.put(2, "Amir");
      hashMap.put(1, "Amit");
      hashMap.put(3, "Roshani");
      hashMap.put(4, "Kapil");
      hashMap.put(5, "Archana");
      System.out.println(hashMap.keySet());
      System.out.println(hashMap.values());
      System.out.println(hashMap.entrySet());

      // Iterator

//        Iterator it = hashMap.entrySet().iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        for(Object hm: hashMap.entrySet()){
//            System.out.println(hm);
//        }

//        for(int i = 0; i <= hashMap.size() - 1; i++){
//        }
//        System.out.print(hashMap.entrySet());

    }
}
