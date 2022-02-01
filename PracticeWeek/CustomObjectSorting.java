import java.util.*;

class Pair {
    int a;
    int b;

    Pair(int _a, int _b) {
        a = _a;
        b = _b;
    }
}

public class CustomObjectSorting {

    static void m2() {
        ArrayList<Pair> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            list.add(new Pair(a, b));
        }

        Collections.sort(list, (x, y) -> {
            return x.a - y.a;
        });

        for (Object x : list) {
            System.out.print(x + ",");
        }

    }

    static void m1() {
        String arr[] = { "Jan", "Feb", "Random", "October", "A", "Arc" };
        Arrays.sort(arr, (a, b) -> {
            return a.length() - b.length();
        });

        for (Object x : arr) {
            System.out.print(x + ",");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        m2();

    }

}