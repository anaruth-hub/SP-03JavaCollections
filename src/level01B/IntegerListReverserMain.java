package level01B;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IntegerListReverserMain {
    public static void main(String[] args) {
        List<Integer> original = createrOriginalList();

        printList("Original list", original);

        List<Integer> reversed = reverseWithListIterator(original);

        printList("Reversed list (using ListIterator)", reversed);

    }

    private static List<Integer> createrOriginalList() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        return numbers;

    }

    private static List<Integer> reverseWithListIterator(List<Integer> original) {
        List<Integer> reversed = new ArrayList<>();

        ListIterator<Integer> iterator = original.listIterator(original.size());

        while (iterator.hasPrevious()) {
            Integer value = iterator.previous();
            reversed.add(value);

        }

        return reversed;

    }

    private static void printList(String title, List<Integer> numbers) {
        System.out.println("\n--- " + title + " ---");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

