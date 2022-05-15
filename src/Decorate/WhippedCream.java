
package Decorate;

public class WhippedCream extends CoffeeDecorator{

    public WhippedCream(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", WhippedCream";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 3;
    }
}
