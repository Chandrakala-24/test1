package Strings;
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

 class ShoppingCart {
    ArrayList<Product> cart = new ArrayList<>();
    ArrayList<String> actionHistory = new ArrayList<>(); // Stores last 3 actions

    // Add a product to cart
    public void addProduct(Product p) {
        cart.add(p);
        recordAction("ADD:" + p.name);
    }

    // Remove product by name
    public void removeProduct(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).name.equalsIgnoreCase(name)) {
                cart.remove(i);
                recordAction("REMOVE:" + name);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Record the last 3 actions only
    private void recordAction(String action) {
        if (actionHistory.size() == 3) {
            actionHistory.remove(0); // Remove oldest
        }
        actionHistory.add(action);
    }

    // Undo the last action
    public void undoLastAction() {
        if (actionHistory.isEmpty()) {
            System.out.println("No actions to undo.");
            return;
        }

        String lastAction = actionHistory.remove(actionHistory.size() - 1);
        String[] parts = lastAction.split(":");
        String type = parts[0];
        String name = parts[1];

        if (type.equals("ADD")) {
            // Undo ADD = remove product
            for (int i = 0; i < cart.size(); i++) {
                if (cart.get(i).name.equalsIgnoreCase(name)) {
                    cart.remove(i);
                    System.out.println("Undo: Removed " + name);
                    return;
                }
            }
        } else if (type.equals("REMOVE")) {
            // Undo REMOVE = add product back with ₹0
            cart.add(new Product(name, 0.0));
            System.out.println("Undo: Re-added " + name + " (₹0)");
        }
    }

    // Show cart items
    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Cart contents:");
        for (Product p : cart) {
            System.out.println(p);
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Product\n2. Remove Product\n3. Undo Last Action\n4. Show Cart\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    cart.addProduct(new Product(name, price));
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String nameToRemove = sc.nextLine();
                    cart.removeProduct(nameToRemove);
                    break;
                case 3:
                    cart.undoLastAction();
                    break;
                case 4:
                    cart.showCart();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
