import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        Map<String,Integer> mp=new HashMap<>();
        // adding elements
        mp.put("yash", 22);
        mp.put("radhe",25);
        mp.put("akash",59);
        mp.put("manish",26);
        // getting value of a key from map
        System.out.println(mp.get("yash"));
        System.out.println(mp.get("rahul"));
        // changing /updating of a value of a key
        mp.put("akash", 29);
        System.out.println(mp.get("akash"));
        // removing a pair from the hashmap
        System.out.println(mp.remove("akash"));
        System.out.println(mp.remove("riya"));
        // checking if a key is in hashmap
        System.out.println(mp.containsKey("akash"));
        System.out.println(mp.containsKey("yash"));
        // adding a new entry only if it not exists already
        mp.putIfAbsent("yash",43);
        mp.putIfAbsent("yashika",20);
        // get all keys in the hashmap
        System.out.println(mp.keySet());
        // get all values in the hash map
        System.out.println(mp.values());
        // get all entries of hashmap
        System.out.println(mp.entrySet());
        // traveling all entries of hashmap-multiple method
        for(String key: mp.keySet()){
            System.out.println(mp.get(key));
        }
        // System.out.println(" ");
        // for(Map.Entry<String,Integer> e:mp.entrySet()){
        //      System.out.printf("age of %s is %d\n",e.getKey(),e.getValue());
        // }
        // System.out.println(" ");
        // for(var e:mp.entrySet()){
        //      System.out.printf("age of %s is %d\n",e.getKey(),e.getValue());
        // }

    }
}

