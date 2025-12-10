package level01A;

import java.util.*;

public class MonthMain { public static void main(String[] args) {
    List<Month> months = createdMonthList();

    printWithForEach("Initial list WITHOUT August (ArrayList)", months);

    insertAugust(months);

    printWithForEach("List WHIT August inserted (ArrayList)", months);

    months.add(new Month("March"));
    months.add(new Month("March"));

    printWithForEach("List with duplicates added (ArrayList)", months);

    Set<Month> monthSet = new LinkedHashSet<>(months);

    printWithForEach("Months stored inside a LinkedHashSet (No duplicates)", monthSet);

    printWithIterator("Iterating LikedHashSet using Iterador", monthSet);

}

    private static List<Month> createdMonthList() {
        List<Month> months = new ArrayList<>();

        months.add(new Month("Gener"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        return months;
    }

    private static void insertAugust(List<Month> months) {
        months.add(7, new Month("August"));

    }

    private static void printWithForEach(String title, Iterable<Month> collection) {
        System.out.println("\n--- " + title + " ---");

        for (Month month : collection) {
            System.out.println(month);
        }
    }

    private static void printWithIterator(String title, Iterable<Month> collection) {
        System.out.println("\n--- " + title + " ---");

        Iterator<Month> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month);
        }
    }
}

