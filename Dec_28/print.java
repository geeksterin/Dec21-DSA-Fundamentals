public class print {

    static void print(int i) {
        // base condition
        if (i > 10) {
            return;
        }
        System.out.print(i + ",");
        print(i + 1); // tail
    }

    static void print(int i) {
        // base condition
        if (i <= 0) {
            return;
        }
        //Egar execution.
        System.out.print(i + ",");
        //do some more computation.
        print(i - 1);
    }

    public static void main(String[] args) {
        print(1);
    }
    // 10,9,8,7,6,....
}
