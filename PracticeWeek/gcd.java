public class gcd {
    static void _gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        _gcd(3, 5);
        lcm(3, 5);
    }
}
