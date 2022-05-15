
package Decorate;

import javax.swing.ImageIcon;


public class Espresso extends Coffee{
  
    
    public Espresso() {
        this.icon = new ImageIcon("\\images\\esp.png");
        this.description = "Espresso";
    }

    @Override
    public int cost() {
        return 5;
    }
    
}
