public class Cat {

    private int need;
    private boolean satiety = false;

    public Cat(int need) {
        this.need = need;
    }

    public void eat(Plate plate, int food) {
        if (plate.getAmount() >= food && food >= this.need) {
            this.satiety = true;
            plate.wasEaten(food);
        }
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setNeed(int need) {
        this.need = need;
    }

    public int getNeed() {
        return need;
    }
}
