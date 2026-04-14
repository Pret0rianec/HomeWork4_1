//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Task1
    System.out.println("    Task_1:");
    {
        int age = 11;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать.");
        }
    }
    // Task2
    System.out.println("    Task_2:");
    {
        int temp = 7;
        if (temp < 5) {
            System.out.println("На улице холодно: " + temp + " градус(ов), нужно надеть шапку");
        } else {
            System.out.println("На улице тепло: " + temp + " градус(ов), можно идти без шапки");
        }
    }
    // Task3
    System.out.println("    Task_3:");
    int speed = 85;
    if (speed > 60) {
        System.out.println("Если скорость " + speed + ", то придётся заплатить штраф!");
    } else {
        System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
    }
    // Task4
    System.out.println("    Task_4:");
    {
        int age = 44;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age < 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }
    // Task5
    System.out.println("    Task_5:");
    {
        int age = 11;
        if (age <= 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребёнка равен " + age +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age > 14) {
            System.out.println("Если возраст человека равен " + age +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    // Task5_ver.2
    System.out.println("    Task_5_ver.2:");
    int age = 5;
    if (age <= 5) {
        System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе.");
    } else if (age <= 14) {
        System.out.println("Если возраст ребёнка равен " + age +
                ", то ему можно кататься на аттракционе в сопровождении взрослого.");
    } else {
        System.out.println("Если возраст человека равен " + age +
                ", то ему можно кататься на аттракционе без сопровождения взрослого.");
    }
    // Task6
    System.out.println("    Task_6:");
    int carriage = 100;
    if (carriage < 102) {
        System.out.println("В вагоне есть место(а), сидячее или стоячее.");
    } else {
        System.out.println("Вогон полностью заполнен, свободных мест нет.");
    }
    int sit = 60;
    if (sit < 60) {
        System.out.println("В вагоне есть место(а) для сидения.");
    } else {
        System.out.println("В вагоне нет сидячих мест!");
    }
    int stand = 38;
    if (stand < 42) {
        System.out.println("В вагоне есть место(а) стоя.");
    } else {
        System.out.println("В вагоне нет стоячих мест!");
    }
// Task7
    System.out.println("    Task_7:");
    int one = 9;
    int two = 2;
    int three = 5;
    if (one >= two && one >= three) {
        System.out.println("Наибольшее число: " + one);
    } else if (two >= one && two >= three) {
        System.out.println("Наибольшее число: " + two);
    } else {
        System.out.println("Наибольшее число: " + three);
    }
}