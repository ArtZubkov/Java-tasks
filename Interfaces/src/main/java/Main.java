import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Human Pall = new Human("Pall");
        Pall.setLimitRun(80);
        Pall.setLimitJump(3);

        Cat Garfield = new Cat("Garfield");
        Garfield.setLimitRun(50);
        Garfield.setLimitJump(1);

        Robot BumbleBee = new Robot("Bumblebee");
        BumbleBee.setLimitRun(200);
        BumbleBee.setLimitJump(25);

        Treadmill treadmill1 = new Treadmill(30);
        Wall wall1 = new Wall(1);

        Treadmill treadmill2 = new Treadmill(50);
        Wall wall2 = new Wall(2);

        Treadmill treadmill3 = new Treadmill(80);
        Wall wall3 = new Wall(5);

        Pall.runToTreadmill(treadmill1);
        Pall.jumpToWall(wall1);

        RunJump[] participants = {Pall, Garfield, BumbleBee};
        Treadmill[] treadmills = {treadmill1, treadmill2, treadmill3};
        Wall[] walls = {wall1, wall2, wall3};

        List<RunJump> winners = new ArrayList<>();


        for (int i = 0; i < participants.length; i++) {

            boolean failed = false;

            for (int j = 0; j < treadmills.length; j++) {

                participants[i].runToTreadmill(treadmills[j]);

                if (!participants[i].runToTreadmill(treadmills[j])) {
                    failed = true;
                    break;
                }

            }
            for (int q = 0; q < walls.length; q++) {

                participants[i].jumpToWall(walls[q]);

                if (!participants[i].jumpToWall(walls[q])) {
                    failed = true;
                    break;
                }
            }

            if (!failed) {
                winners.add(participants[i]);
            }


        }

        System.out.println("Winners: ");
        for (RunJump x : winners) {
            System.out.println(x.getName());
        }


    }

}
