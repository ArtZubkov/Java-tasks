public class Cat extends Animal {

    @Override
    public void run(int length) {
        boolean flag = (length <= 200);
        System.out.println("run: " + flag);
    }

    @Override
    public void swim(int length) {
        boolean flag = false;
        System.out.println("swim: " + flag);
    }

    @Override
    public void jump(int height) {
        boolean flag = (height <= 2);
        System.out.println("jump: " + flag);
    }
}
