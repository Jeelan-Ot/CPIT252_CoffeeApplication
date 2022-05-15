
package Decorate;

import javax.swing.ImageIcon;


public class Black extends Coffee{
    
    public Black() {
        this.icon = new ImageIcon("images\\black.png");
        this.description = "Black";
    }

    @Override
    public int cost() {
        return 10;
    }
    
}
