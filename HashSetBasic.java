import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasic {
    // set is an important ds,that gives constant time compelexicity in adding,removing and searching
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        // adding elements in the set
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);

        // to chake the element is contains or not
        System.out.println(set.contains(3));
        System.out.println(set.contains(9));

        // to remove an element
        set.remove(5);
        // size
        System.out.println(set.size());
        // print all elements
        System.out.println(set);

        // iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
}
