import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class arrayList{
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Apple"); // Duplicates allowed
        System.out.println(list1.get(0)); // Access by index

        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);


        //get element
        int a = list.get(1);
        System.out.println(a);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        // list.set(0,0);
        // System.out.println(list);

        //Delete Element
        list.remove(3);
        System.out.println(list);

        //return size
        System.out.println(list.size());

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        Collections.sort(list);
        System.out.println(list);
        
        
        //Array
        // int arr[] = new int[2];
        // int ar[] = {1,2,3,4};
        // arr[0] = 2 ;
        // arr[1] = 3;
        // System.out.println(ar[0]);
      
       
    }
}