
public class Coffee {
    
    private String beanType;
    private String milkType;
    private int shotNum;
    private String toppings;
    private boolean isDecaf;
    public Coffee(){
        
    }
    public Coffee(String beanType, String milkType, int shotNum, String toppings, boolean isDecaf) {
        this.beanType = beanType;
        this.milkType = milkType;
        this.shotNum = shotNum;
        this.toppings = toppings;
        this.isDecaf = isDecaf;
    }

    public String getBeanType() {
        return beanType;
    }

    public void setBeanType(String beanType) {
        this.beanType = beanType;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public int getShotNum() {
        return shotNum;
    }

    public void setShotNum(int shotNum) {
        this.shotNum = shotNum;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public boolean isIsDecaf() {
        return isDecaf;
    }

    public void setIsDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }
    
    
}
