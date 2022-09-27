public class Main {


    public static void main(String[] args) {
        //Домашнее задание -1.
        // Задача 1.
        System.out.println("Домашнее задание 1.");
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием");
        }
        if (age < 18) {
            System.out.println("Совершенолетие ещё не наступило, необходимо подождать");
        }
        System.out.println();


        //Задача 2.
        System.out.println("Задача 2.");
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println(" Человек закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();
        // Задача 3.
        System.out.println("Задача 3.");
        int totalSeats = 102;
        int seatPlace = 60;
        int standing = 42;
        int totalFreePlaces = totalSeats - seatPlace - standing;

        if (totalFreePlaces < 102) {
            System.out.println(+totalFreePlaces + " Свободных мест в вагоне ");
        }

        if (seatPlace >= 60) {
            System.out.println("Сидячих мест нет");
        }
        if (seatPlace < 60) {
            System.out.println(60 - seatPlace + " Количесво сидячих мест в вагоне");
        }
        if (standing >= 42) {
            System.out.println("Стоячих мест нет");
        }
        if (standing < 42) {
            System.out.println(42 - standing + " Количество стоячих мест");
        }
        System.out.println();

        // Домашнее задание - 2.
        // Задача - 1.

        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершенолетием");
        } else {
            System.out.println("Совершенолетие ещё не наступило, необходимо подождать");
        }
        System.out.println();


        // Задача - 2.
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println(" Человек закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();


        // Задача 3
        System.out.println("Задача 3");

        if (totalFreePlaces < 102) {
            System.out.println(+totalFreePlaces + " Свободных мест в вагоне ");
        } else {
            System.out.println("Своюодных мест нет");
        }
        if (seatPlace >= 60) {
            System.out.println("Сидячих мест нет");
        }
        if (seatPlace < 60) {
            System.out.println(60 - seatPlace + " Количесво сидячих мест в вагоне");
        }
        if (standing >= 42) {
            System.out.println("Стоячих мест нет");
        }
        if (standing < 42) {
            System.out.println(42 - standing + " Количество стоячих мест");
        }
        System.out.println();


        // Домашнее задание - 3
        System.out.println("Домашнее задание -3");
        System.out.println("Задача 1");
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет ,то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет ,то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет ,то его место в университете");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " лет ,то ему пора ходить на работу");
        }
        System.out.println();

        //Задача 2.
        System.out.println("Задача 2");
        if (age < 5) {
            System.out.println(" Не может кататься на атракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println(" Может кататься в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age >= 14) {
            System.out.println("Может кататья без сопровождения взрослого");
        }
        System.out.println();

        //Задача 3.
        System.out.println("Задача 3");

        int one = 100;
        int two = 50;
        int three = 50;
        if (one > two && one > three) {
            System.out.println(" Максимальным числом является " + one);
        } else if (two > one && two > three) {
            System.out.println("Максимальным числом является " + two);
        } else {
            System.out.println("Максимальным числом является " + three);
        }


    }

}




