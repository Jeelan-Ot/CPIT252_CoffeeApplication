
package Decorate;


public class Caramel extends CoffeeDecorator{

    public Caramel(Coffee c) {
        this.coffee = c;
    }
    
    @Override
     public String getDescription() {
        return this.coffee.getDescription() +", Caramel";
    }
    
    @Override
    public int cost() {
        return this.coffee.cost() + 4;
    }
}
