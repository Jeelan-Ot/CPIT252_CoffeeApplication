
package Decorate;

import javax.swing.ImageIcon;

public class Matcha extends Coffee{
    
    public Matcha() {
        this.icon = new ImageIcon("src\\images\\matchaL.png");
        this.description = "Matcha";
    }
    
    @Override
    public int cost() {
        return 16;
    }
    
}
