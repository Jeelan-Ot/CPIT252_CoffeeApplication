
package Decorate;

public class MediumSize extends CoffeeDecorator{

    public MediumSize(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", MediumSize";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 3;
    }
}




