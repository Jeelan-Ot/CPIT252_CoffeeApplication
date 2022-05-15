
package Decorate;

public class Cappuccino extends Coffee{

    public Cappuccino() {
        this.description = "Cappuccino";
    }
    
    @Override
    public int cost() {
        return 12;
    }
    
}
