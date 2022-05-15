package CoffeeFactory;

public class CoffeeFactory {

    public Coffee getCoffee(String coffeeType) {
        if (coffeeType.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        } else if (coffeeType.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (coffeeType.equalsIgnoreCase("BlackCoffee")) {
            return new BlackCoffee();
        } else if (coffeeType.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if (coffeeType.equalsIgnoreCase("Matcha")) {
            return new Matcha();
        } else if (coffeeType.equalsIgnoreCase("Mocha")) {
            return new Mocha();
        }
        return null;
    }
}
