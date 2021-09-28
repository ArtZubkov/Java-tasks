public class Plate {

    private int amount;

    public Plate(int amount) {
        this.amount = amount;
    }

    public void addEat(int addEat) {
        this.amount += addEat;
    }

    public void eating(int paramFood) {
        this.amount -= paramFood;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
