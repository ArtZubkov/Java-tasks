public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(150);
        //Cat brit = new Cat();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat();
        cats[1] = new Cat();
        cats[2] = new Cat();

        int paramFood = 50; // кол-во еды для каждого кота

        for (int i = 0; i < cats.length; i++) {

            if (plate.getAmount() >= paramFood) {
                cats[i].eat(paramFood);
                plate.eating(paramFood);
            }

        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Cat" + (i + 1) + ": " + cats[i].getSatiety());
        }


    }
}
