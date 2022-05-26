
package Decorate;


public class IceCream extends CoffeeDecorator{

    public IceCream(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", IceCream";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 7;
    }
}





