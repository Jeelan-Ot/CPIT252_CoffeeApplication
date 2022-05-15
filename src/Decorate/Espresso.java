
package Decorate;


public class Espresso extends Coffee{

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public int cost() {
        return 5;
    }
    
}
