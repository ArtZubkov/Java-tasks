public class Main {

    public static void main(String[] args) {

        // Блок "Классы, объекты, конструкторы, инкапсуляция"

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Jack Black", "Tester", "blackjack@inbox.com",
                "892512758", 60000, 21);
        employees[1] = new Employee("Barry Nickolson", "Painter", "barrynickolson@inbox.com",
                "891662322", 90000, 28);
        employees[2] = new Employee("Carter Slade", "Raider", "carterslade@inbox.com",
                "897712993", 45000, 51);
        employees[3] = new Employee("Monty Power", "Manager", "powermonty@inbox.com",
                "892712447", 25000, 23);
        employees[4] = new Employee("Rogers Hot", "Musician", "rogershot@inbox.com",
                "896212291", 500000, 27);

        for (Employee x : employees) {
            if (x.getAge() > 40) {
                x.getInfo();
            }
        }


        // Блок "Классы, объекты, наследование"

        Cat cat1 = new Cat();
        Dog dog1 = new Dog(400);
        Dog dog2 = new Dog(600);

        System.out.println("-Cat-");
        cat1.run(50);
        cat1.swim(2);
        cat1.jump(3);

        System.out.println("-Dog1-");
        dog1.run(400);
        dog1.swim(10);
        dog1.jump(9);

        System.out.println("-Dog2-");
        dog2.run(600);
        dog2.swim(11);
        dog2.jump(9);


    }

}
