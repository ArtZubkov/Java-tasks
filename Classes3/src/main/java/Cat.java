public class Cat {

    private boolean satiety = false;

    public void eat(int food) {
        this.satiety = true;
    }

    public boolean getSatiety() {
        return satiety;
    }
}
