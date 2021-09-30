public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(150);
        //Cat brit = new Cat();

        Cat[] cats = new Cat[3];
        cats[0] = new Cat(40);
        cats[1] = new Cat(70);
        cats[2] = new Cat(50);

        int paramFood = 50; // кол-во еды для каждого кота

        for (Cat cat : cats) {
            cat.eat(plate, paramFood);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Cat" + (i + 1) + ": " + cats[i].getSatiety());
        }

    }
}
