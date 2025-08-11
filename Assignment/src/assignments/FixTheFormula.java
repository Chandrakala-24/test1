package assignments;
import java.util.*;
public class FixTheFormula {
	public static int formula(String input) {
		List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.add(Character.getNumericValue(ch));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.add(ch);
            }
        }
        int result = numbers.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            int num = numbers.get(i + 1);

            switch (op) {
                case '+': result = result + num; break;
                case '-': result = result - num; break;
                case '*': result = result * num; break;
                case '/': 
                    if (num != 0) {
                        result = result / num; 
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(formula(input));
        sc.close();
    }
}

