import java.util.Scanner;
import Coffee.Coffee;
import Coffee.CoffeeFactory;
import Decorators.CaramelDecorator;
import Decorators.ChocolateDecorator;
import Decorators.MilkDecorator;
import Decorators.WhippedCreamDecorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Choose your coffee: Espresso, Cappuccino, Latte, Americano");
        String coffeeType = scanner.nextLine();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Add an ingredient? (milk, caramel, whippedcream, chocolate) or type 'done' to finish:");
            String topping = scanner.nextLine().toLowerCase();

            switch (topping) {
                case "milk":
                    coffee = new MilkDecorator(coffee);
                    break;
                case "caramel":
                    coffee = new CaramelDecorator(coffee);
                    break;
                case "whippedcream":
                    coffee = new WhippedCreamDecorator(coffee);
                    break;
                case "chocolate":
                    coffee = new ChocolateDecorator(coffee);
                    break;
                case "done":
                    addingToppings = false;
                    break;
                default:
                    System.out.println("Invalid topping. Try again.");
                    break;
            }
        }
        System.out.println("\nYour order: " + coffee.getDescription());
        System.out.printf("Total cost: $%.2f\n", coffee.getCost());

        scanner.close();
    }
}
