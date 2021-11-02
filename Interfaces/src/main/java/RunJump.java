public interface RunJump {
    String getName();

    void run();

    void jump();

    boolean runToTreadmill(Treadmill treadmill);

    boolean jumpToWall(Wall wall);

}
