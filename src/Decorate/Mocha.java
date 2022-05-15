
package Decorate;

import javax.swing.ImageIcon;

public class Mocha extends Coffee{
    public Mocha() {
        this.icon = new ImageIcon("images\\mocha.png");
        this.description = "Mocha";
    }

    @Override
    public int cost() {
        return 14;
    }
    
}
