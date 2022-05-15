package CartOrder;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {

    ArrayList<Item> item;
    double totalAmount;

    ShoppingCart() {
        this.item = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addToCart(Item item) {
        this.item.add(item);
    }

    public void showCart() {
        ListIterator<Item> iterator = item.listIterator();
        while (iterator.hasNext()) {
            Item item1 = iterator.next();
            System.out.println(item1);
        }
    }

    public void removeFromCart(Item i) {
        ListIterator<Item> iterator1 = item.listIterator();
        while (iterator1.hasNext()) {
            Item item2 = iterator1.next();
            if (item2.getDescription().equals(i.getDescription())) {
                this.item.remove(i);
                break;
            }
        }
    }

    public void cleanCart(Item i) {
        ListIterator<Item> iterator = item.listIterator();
        while (iterator.hasNext()) {
            Item item2 = iterator.next();
            this.item.remove(item2);
        }
    }

    public double getTotalAmount() {
        ListIterator<Item> iterator2 = item.listIterator();
        this.totalAmount = 0;
        while (iterator2.hasNext()) {
            Item item3 = iterator2.next();
            this.totalAmount = this.totalAmount + item3.cost();
        }
        return this.totalAmount;
    }

    public String printInvoice() {
        String invoice="";
        ListIterator<Item> iterator3 = item.listIterator();
        while (iterator3.hasNext()) {
            Item item4 = iterator3.next();
            invoice += (item4.getDescription() + "\t");
            invoice += (item4.cost() + "\t");
            invoice+="\n\n";
        }
        invoice += ("\n\t\t\t" + "Total    : " + this.getTotalAmount());
        return invoice;
    }
    
}
