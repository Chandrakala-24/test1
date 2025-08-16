package Milestone2;
import java.util.Scanner;

public class generateseriesandfindnthelement {

    public static void seriesN(int input1, int input2, int input3, int input4) {
        int result;

        if (input4 == 1) {
            result = input1;
        } else if (input4 == 2) {
            result = input2;
        } else if (input4 == 3) {
            result = input3;
        } else {
            int gap1 = input2 - input1;
            int gap2 = input3 - input2;

            int current = input3;
            boolean useGap1 = true; 

            for (int i = 4; i <= input4; i++) {
                if (useGap1) {
                    current += gap1;
                    useGap1 = false;
                } else {
                    current += gap2;
                    useGap1 = true;
                }
            }
            result = current;
        }

        System.out.println("The " + input4 + "th term is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first three terms and position n: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        seriesN(a, b, c, n);

        sc.close();
    }
}
