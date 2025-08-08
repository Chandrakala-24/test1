package AlternateSum;

public class AddSub {

    public static int AddSub(int N, int opt) {
        int result = 0;
        boolean add = true;

        if (opt == 1) {
            // For opt = 1: Start with N, alternate signs starting with addition
            for (int i = N; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result -= i;
                }
                add = !add; // Toggle between add and subtract
            }
        } else if (opt == 2) {
            // For opt = 2: Start with N, alternate signs starting with addition
            for (int i = N; i >= 1; i--) {
                if (add) {
                    result += i;
                } else {
                    result = i;
                }
                add = !add;
            }
        } else {
            System.out.println("Invalid option.");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 6;
        int opt1 = 1;
        int opt2 = 2;

        System.out.println("Result for N=6, opt=1: " + AddSub(N, opt1)); // Output: 3
        System.out.println("Result for N=6, opt=2: " + AddSub(N, opt2)); // Output: 9
    }
}
