import java.util.ArrayList;
import java.util.Collections;

public class program22 {
    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            Collections.swap(list, i, i + 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> myList1 = new ArrayList<>();
        myList1.add("four");
        myList1.add("score");
        myList1.add("and");
        myList1.add("seven");
        myList1.add("years");
        myList1.add("ago");

        ArrayList<String> myList2 = new ArrayList<>();
        myList2.add("to");
        myList2.add("be");
        myList2.add("or");
        myList2.add("not");
        myList2.add("to");
        myList2.add("be");
        myList2.add("hamlet");

        swapPairs(myList1);
        swapPairs(myList2);

        System.out.println("Swapped list 1: " + myList1);
        System.out.println("Swapped list 2: " + myList2);
    }
}
