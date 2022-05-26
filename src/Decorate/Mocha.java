
package Decorate;

import javax.swing.ImageIcon;

public class Mocha extends Coffee{
    public Mocha() {
        this.icon = new ImageIcon("src\\images\\mochaL.png");
        this.description = "Mocha";
    }

    @Override
    public int cost() {
        return 14;
    }
    
}




