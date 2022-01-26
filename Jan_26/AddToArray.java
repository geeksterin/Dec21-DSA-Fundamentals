import java.util.*;

public class AddToArray {
    static public List<Integer> addToArrayForm(int[] num, int k) {
        var res = new LinkedList<Integer>();
        int i = num.length - 1;

        while (i >= 0 || k != 0) {
            if (i >= 0)
                k = k + num[i--];
            res.addFirst(k % 10);
            k = k / 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] num = { 2, 1, 5 };
        int k = 806;
        System.out.println(addToArrayForm(num, k));

    }
}
