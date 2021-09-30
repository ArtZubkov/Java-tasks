public class Animal {

    private String name;
    private int age;
    private int limit;

    public void run(int length) {
        System.out.println("run: " + (length <= this.limit));
    }

    public void swim(int length) {
        System.out.println("swim: ");
    }

    public void jump(int height) {
        System.out.println("jump: ");
    }
}
