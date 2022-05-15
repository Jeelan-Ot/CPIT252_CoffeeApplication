
package Decorate;

import javax.swing.ImageIcon;

public class Latte extends Coffee{
    
    public Latte() {
        this.icon = new ImageIcon("\\images\\latte.png");
        this.description = "Latte";
    }

    @Override
    public int cost() {
        return 13;
    }
    
}
