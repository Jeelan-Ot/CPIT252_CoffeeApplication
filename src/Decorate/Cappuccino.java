
package Decorate;

import javax.swing.ImageIcon;

public class Cappuccino extends Coffee{
    
    public Cappuccino() {
        this.description = "Cappuccino";
        this.icon = new ImageIcon("src\\images\\capL.png");
    }
    
    @Override
    public int cost() {
        return 12;
    }

    
}
