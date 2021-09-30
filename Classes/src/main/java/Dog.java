public class Dog extends Animal {
    private int limit;

    public Dog() {
        this.limit = 500;
    }

    public Dog(int limit) {
        this.limit = limit;
    }

    @Override
    public void run(int length) {
        System.out.println("run: " + (length <= this.limit));
    }

    @Override
    public void swim(int length) {
        System.out.println("swim: " + (length <= 10));
    }

    @Override
    public void jump(int height) {
        System.out.println("jump: " + (height <= 0.5));
    }

}
