import java.util.ArrayList;
import java.util.Collections;

public class arrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> abc= new ArrayList<>();

        // store multiple data of different datatypes
        ArrayList al=new ArrayList();
        al.add(5);
        al.add("abc");
        Object ab=al.get(1);
        System.out.println(ab);

// adding elements in the list at last
        list.add(5);
        list.add(1);
        list.add(10);
        list.add(4);
        list.add(7);

        

// adding new element in the list at any index position
        list.add(2,25);

        abc.add("ram");
        abc.add("radhe");
        abc.add("abc");
        abc.add("arul");
        System.out.println(list);
        System.out.println(abc);



// to write another element insted of other by index
        list.set(2, 50);
        abc.set(2, "yash");
        System.out.println(list);
        System.out.println(abc);


// getting a particuler elemnt of list by index number
        int ele=list.get(2);
        System.out.println(ele);

// delete the element of list
       list.remove(4);
       System.out.println(list);

// sort the list
       Collections.sort(list);
       System.out.println(list);

// reverse the list element
      for(int i=list.size()-1;i>=0;i--){
       System.out.print(list.get(i)+" ");
      }    
    }
}
