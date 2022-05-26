package Decorate;

public class Velvet extends CoffeeDecorator {

    public Velvet(Coffee c) {
        this.coffee = c;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Red Velvet";
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 5;
    }

}




