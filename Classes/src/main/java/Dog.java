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
        boolean flag = (length <= this.limit);
        System.out.println("run: " + flag);
    }

    @Override
    public void swim(int length) {
        boolean flag = (length <= 10);
        System.out.println("swim: " + flag);
    }

    @Override
    public void jump(int height) {
        boolean flag = (height <= 0.5);
        System.out.println("jump: " + flag);
    }

}
