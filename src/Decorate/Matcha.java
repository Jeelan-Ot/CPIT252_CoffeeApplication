
package Decorate;

public class Matcha extends Coffee{

    public Matcha() {
        this.description = "Matcha";
    }
    
    @Override
    public int cost() {
        return 16;
    }
    
}
