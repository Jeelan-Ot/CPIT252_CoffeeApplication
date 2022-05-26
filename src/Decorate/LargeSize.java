
package Decorate;

public class LargeSize extends CoffeeDecorator{

    public LargeSize(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", LargeSize";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 5;
    }
}





