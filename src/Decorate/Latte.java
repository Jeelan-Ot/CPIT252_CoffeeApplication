
package Decorate;

import javax.swing.ImageIcon;

public class Latte extends Coffee{
    
    public Latte() {
        this.icon = new ImageIcon("src\\images\\latteL.png");
        this.description = "Latte";
    }

    @Override
    public int cost() {
        return 13;
    }
    
}





