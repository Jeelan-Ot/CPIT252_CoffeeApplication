
package Decorate;

public class Mint extends CoffeeDecorator{

    public Mint(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", Mint";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 2;
    }
}
