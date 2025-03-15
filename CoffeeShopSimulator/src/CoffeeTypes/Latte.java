package CoffeeTypes;

import Coffee.Coffee;

public class Latte implements Coffee {
    @Override
    public double getCost() {
        return 4.0;
    }

    @Override
    public String getDescription() {
        return "Latte";
    }
}
