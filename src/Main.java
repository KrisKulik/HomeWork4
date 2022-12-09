public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
    } else {
        System.out.println("Сегодня тепло, можно идти без шапки");}


    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 78;
        if (speed>60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно");
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 21;
        if (age>2 && age<6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему не нужно ходить в детский сад");
        }
        if (age > 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему не нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему не нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + " и он учится, то ему необязательно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int ageOne = 11;
        if (ageOne < 5) {
            System.out.println("Если ребенку " + ageOne + " лет, то он не может кататься на аттракционе");
        } else {
            System.out.println("Если ребенку " + ageOne + " лет, то он может кататься на аттракционах, только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        int ageTwo = 4;
        if (ageTwo > 5 && ageTwo < 14) {
            System.out.println("Если ребенку " + ageTwo + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если ребенку " + ageTwo + " лет, то он не может кататься на аттракционах");
        }
        int ageThree = 14;
        if (ageThree > 14) {
            System.out.println("Если ребенку " + ageThree + " то он может кататься без сопровождения взрослого");
        } else {
            System.out.println("Если ребенку " + ageThree + " то он не может кататься без сопровождения взрослого. Если взрослого нет, то кататься нельзя");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int totalPlace = 102;
        int seatPlace = 60;
        int standingPlace = totalPlace - seatPlace;


        int occupiedSeatPlace = 50;
        int occupiedStandingPlace = 15;
        int occupiedPlace = occupiedStandingPlace + occupiedSeatPlace;


        if (occupiedPlace <= 102 && seatPlace >= occupiedSeatPlace && standingPlace >= occupiedStandingPlace) {
            System.out.println((totalPlace - occupiedPlace) + " свободных мест в вагоне");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }
        if (occupiedSeatPlace < 60) {
            System.out.println((seatPlace - occupiedSeatPlace) + " cвободных сидячих мест");
        } else {
            System.out.println(" cвободных сидячих мест нет");
        }
        if (occupiedStandingPlace >= standingPlace) {
            System.out.println("Cтоячих мест нет");
        } else {
            System.out.println((standingPlace - occupiedStandingPlace) + " стоячих мест");
        }

        }


    public static void task7 () {
        System.out.println("Задача 7");
        int numberOne = 20;
        int numberTwo = 15;
        int numberThree = 21;
        if (numberOne < numberThree && numberTwo < numberThree) {
            System.out.println(numberThree + " большее число");
        } else {
            System.out.println(numberThree + " не большее число");
        }

    }
}
