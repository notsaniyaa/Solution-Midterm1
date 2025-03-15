package CoffeeTypes;

import Coffee.Coffee;

public class Cappuccino implements Coffee {
    @Override
    public double getCost() {
        return 3.5;
    }

    @Override
    public String getDescription() {
        return "Cappuccino";
    }
}

