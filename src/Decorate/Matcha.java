
package Decorate;

import javax.swing.ImageIcon;

public class Matcha extends Coffee{
    
    public Matcha() {
        this.icon = new ImageIcon("\\images\\matcha.png");
        this.description = "Matcha";
    }
    
    @Override
    public int cost() {
        return 16;
    }
    
}
