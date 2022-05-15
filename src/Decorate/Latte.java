
package Decorate;

public class Latte extends Coffee{

    public Latte() {
        this.description = "Latte";
    }

    @Override
    public int cost() {
        return 13;
    }
    
}
