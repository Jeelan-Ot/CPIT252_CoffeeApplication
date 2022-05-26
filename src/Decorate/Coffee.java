package Decorate;
import CartOrder.Item;
import javax.swing.ImageIcon;

public abstract class Coffee implements Item{
    public ImageIcon icon ;
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
    
    public ImageIcon getIcon(){
        return this.icon;
    }
}



