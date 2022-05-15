
package Decorate;

public class Mocha extends Coffee{

    public Mocha() {
        this.description = "Mocha";
    }

    @Override
    public int cost() {
        return 14;
    }
    
}
