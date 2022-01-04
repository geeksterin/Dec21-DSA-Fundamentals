public class Intro {

    // static int cnt = 0;

    static public void foo(int cnt) {
        // 1. Base condition or stopping condition.
        if (cnt == 5) {
            return;
        }

        // 2. recursive part
        System.out.println("Inside foo");
        foo(cnt + 1); //Tail recursion.
    }

    public static void main(String[] args) {
        // .Calling function multiple times
        foo(0);

    }
}
