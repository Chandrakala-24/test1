package Project;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EventRegistrationSystem system = new EventRegistrationSystem();

	        System.out.println("Enter participant details (type 'exit' to stop):");

	        while (true) {
	            System.out.print("\nEnter name: ");
	            String name = sc.nextLine();
	            if (name.equalsIgnoreCase("exit")) break;

	            System.out.print("Enter email: ");
	            String email = sc.nextLine();

	            User user = new User(name, email);
	            system.register(user);
	        }

	        system.printStatus();
	        sc.close();
	    }
	}


