

package Decorate;

public class CoffeeDecorator extends Coffee{
    
    private Coffee coffee;
    
    @Override
    public int cost() {
        return coffee.cost(); 
    }
    
}
