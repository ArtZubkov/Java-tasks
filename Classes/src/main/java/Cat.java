public class Cat extends Animal {

    @Override
    public void run(int length) {
        System.out.println("run: " + (length <= 200));
    }

    @Override
    public void swim(int length) {
        System.out.println("swim: " + false);
    }

    @Override
    public void jump(int height) {
        System.out.println("jump: " + (height <= 2));
    }
}
