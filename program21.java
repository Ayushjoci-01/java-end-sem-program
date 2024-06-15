/*Collection and Generic Framework:
Write a method removeEvenLength that takes an ArrayList of Strings as a
parameter and that removesall the strings of even length from the list.
(Use ArrayList)*/
import java.util.ArrayList;

public class program21 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("kiwi");
        list.add("grape");
        list.add("pear");

        System.out.println("Original list: " + list);

        removeEvenLength(list);

        System.out.println("List after removing even-length strings: " + list);
    }

    public static void removeEvenLength(ArrayList<String> list) {
        // Iterate backwards to avoid ConcurrentModificationException
        for (int i = list.size() - 1; i >= 0; i--) {
            String str = list.get(i);
            if (str.length() % 2 == 0) {
                list.remove(i); // Remove the string if its length is even
            }
        }
    }
}
