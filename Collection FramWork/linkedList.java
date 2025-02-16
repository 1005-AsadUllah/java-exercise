
import java.util.LinkedList;




public class linkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("name");
        list.addFirst("My");
        list.addLast("AsadUlah");
        list.add(2, "is");
        
        list.remove(2);
        // System.out.println(list);
        // list.removeFirst();
        // System.out.println(list);
        // list.removeLast();
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

    }
}
