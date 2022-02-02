package PracticeWeek.LamdaExpression;
import java.util.*;

public class lamda {

    static class comp implements Comparator {

        @Override
        public int compare(Object obj1, Object obj2) {
            Integer x = (Integer) obj1;
            Integer y = (Integer) obj2;

            // logic to compare objects
            return -1 * (x - y); // hacked
        }
    }

    static class lencomp implements Comparator {
        @Override
        public int compare(Object obj1, Object obj2) {
            String x = (String) obj1;
            String y = (String) obj2;
            return -1* (x.length() - y.length());
        }
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 0, 10, 11, 15, -1, 4 };

        Arrays.sort(arr, (a, b) -> {
            return -1 * (a - b);
        });

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");

        String[] sa = { "arun", "singh", "a", "b", "rahul", "katrina" }; // dict order.

        // custom defined sorting based len of strings
        Arrays.sort(sa, new lencomp());

        for (String x : sa) {
            System.out.print(x + " ");
        }
    }
}
