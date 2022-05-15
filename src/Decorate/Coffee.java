package Decorate;

public abstract class Coffee {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract int cost();
}
