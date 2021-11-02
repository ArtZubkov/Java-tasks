
public class Human implements RunJump {
    private String name;
    private int limitRun;
    private int limitJump;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public void setLimitJump(int limitJump) {
        this.limitJump = limitJump;
    }

    public int getLimitJump() {
        return limitJump;
    }

    public void run() {
        System.out.println("Human is running");
    }

    public void jump() {
        System.out.println("Human is jumping");
    }

    public boolean runToTreadmill(Treadmill treadmill) {
        /*
        if (treadmill.getLength() <= this.limitRun) {
            System.out.println("Ran successfully!");
        } else {
            System.out.println("Couldn't run.");
        }
        */
        return treadmill.getLength() <= this.limitRun;
    }


    public boolean jumpToWall(Wall wall) {
        /*
        if (wall.getHeight() <= this.limitJump) {
            System.out.println("Jumped successfully!");
        } else {
            System.out.println("Couldn't jump.");
        }

        */
        return wall.getHeight() <= this.limitJump;
    }
}
