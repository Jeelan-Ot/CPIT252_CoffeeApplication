
package Decorate;


public class Vanilla extends CoffeeDecorator{

    public Vanilla(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", Vanilla";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 3;
    }
}
