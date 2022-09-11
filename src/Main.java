public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int age = 25;
        System.out.println("Возраст " + age + " лет:");
        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием!");
        if (age < 18)
            System.out.println("Нужно немного подождать,возраст совершеннолетия ещё не наступил.");

        age = 15;
        System.out.println("Возраст " + age + " лет:");
        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием!");
        if (age < 18)
            System.out.println("Нужно немного подождать,возраст совершеннолетия ещё не наступил.");

        //Задание 2
        System.out.println("Задание 2");

        int ageOfHuman = 8;
        System.out.println("Возраст " + ageOfHuman + " лет:");
        if (ageOfHuman >= 7 && ageOfHuman < 18)
            System.out.println("Ребенок ходит в школу.");
        if (ageOfHuman >= 18 && ageOfHuman < 24)
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        if (ageOfHuman >= 24)
            System.out.println("Человек окончил университет и ему пора искать первую работу.");

        ageOfHuman = 20;
        System.out.println("Возраст " + ageOfHuman + " лет:");
        if (ageOfHuman >= 7 && ageOfHuman < 18)
            System.out.println("Ребенок ходит в школу.");
        if (ageOfHuman >= 18 && ageOfHuman < 24)
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        if (ageOfHuman >= 24)
            System.out.println("Человек окончил университет и ему пора искать первую работу.");

        ageOfHuman = 30;
        System.out.println("Возраст " + ageOfHuman + " лет:");
        if (ageOfHuman >= 7 && ageOfHuman < 18)
            System.out.println("Ребенок ходит в школу.");
        if (ageOfHuman >= 18 && ageOfHuman < 24)
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        if (ageOfHuman >= 24)
            System.out.println("Человек окончил университет и ему пора искать первую работу.");

        //Задание 3
        System.out.println("Задание 3");

        int capacityVagon = 30;
        System.out.println("В вагоне занято " + capacityVagon + " мест:");

        if (capacityVagon < 60)
            System.out.println("Можно знанять сидячее место и стоячее место.");
        if (capacityVagon >= 60 && capacityVagon < 102)
            System.out.println("Можно занять только стоячее место");
        if (capacityVagon >= 102)
            System.out.println("Нет мест");

        capacityVagon = 80;
        System.out.println("В вагоне занято " + capacityVagon + " мест:");

        if (capacityVagon < 60)
            System.out.println("Можно знанять сидячее место и стоячее место.");
        if (capacityVagon >= 60 && capacityVagon < 102)
            System.out.println("Можно занять только стоячее место");
        if (capacityVagon >= 102)
            System.out.println("Нет мест");

        capacityVagon = 102;
        System.out.println("В вагоне занято " + capacityVagon + " мест:");

        if (capacityVagon < 60)
            System.out.println("Можно знанять сидячее место и стоячее место.");
        if (capacityVagon >= 60 && capacityVagon < 102)
            System.out.println("Можно занять только стоячее место");
        if (capacityVagon >= 102)
            System.out.println("Нет мест");

        //Задача 4
        System.out.println("Задание 4");
        age = 25;
        System.out.println("Возраст " + age + " лет:");
        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием!");
        else
            System.out.println("Нужно немного подождать,возраст совершеннолетия ещё не наступил.");

        age = 15;
        System.out.println("Возраст " + age + " лет:");
        if (age >= 18)
            System.out.println("Поздравляю с совершеннолетием!");
        else
            System.out.println("Нужно немного подождать,возраст совершеннолетия ещё не наступил.");

        //Задача 5
        System.out.println("Задание 5");

        ageOfHuman = 8;
        System.out.println("Возраст " + ageOfHuman + " лет:");
        if (ageOfHuman < 7)
            System.out.println("Ребенок совсем маленький");
        else {
            if ( ageOfHuman < 18)
                System.out.println("Ребенок ходит в школу.");
            else {
                if (ageOfHuman < 24)
                    System.out.println("Человек уже закончил школу и может отправляться в университет.");
                else
                    System.out.println("Человек окончил университет и ему пора искать первую работу.");
            }
        }

        ageOfHuman = 20;
        System.out.println("Возраст " + ageOfHuman + " лет:");
        if (ageOfHuman < 7)
            System.out.println("Ребенок совсем маленький");
        else {
            if (ageOfHuman < 18)
                System.out.println("Ребенок ходит в школу.");
            else {
                if (ageOfHuman < 24)
                    System.out.println("Человек уже закончил школу и может отправляться в университет.");
                else
                    System.out.println("Человек окончил университет и ему пора искать первую работу.");
            }
        }

        ageOfHuman = 30;
        System.out.println("Возраст " + ageOfHuman + " лет:");
        if (ageOfHuman < 7)
            System.out.println("Ребенок совсем маленький");
        else {
            if (ageOfHuman < 18)
                System.out.println("Ребенок ходит в школу.");
            else {
                if (ageOfHuman < 24)
                    System.out.println("Человек уже закончил школу и может отправляться в университет.");
                else
                    System.out.println("Человек окончил университет и ему пора искать первую работу.");
            }
        }

        //Задача 6
        System.out.println("Задание 6");

        capacityVagon = 30;
        System.out.println("В вагоне занято " + capacityVagon + " мест:");

        if (capacityVagon <60)
            System.out.println("Можно знанять сидячее место и стоячее место.");
        else {
            if (capacityVagon <102)
                System.out.println("Можно занять только стоячее место");
            else {
                    System.out.println("Нет мест");
                }
            }
        capacityVagon = 80;
        System.out.println("В вагоне занято " + capacityVagon + " мест:");

        if (capacityVagon <60)
            System.out.println("Можно знанять сидячее место и стоячее место.");
        else {
            if (capacityVagon < 102)
                System.out.println("Можно занять только стоячее место");
            else {
                    System.out.println("Нет мест");
                }
            }

        capacityVagon = 102;
        System.out.println("В вагоне занято " + capacityVagon + " мест:");

        if (capacityVagon <60)
            System.out.println("Можно знанять сидячее место и стоячее место.");
        else {
            if (capacityVagon < 102)
                System.out.println("Можно занять только стоячее место");
            else {
                    System.out.println("Нет мест");
                }
             }

        //Задача 7
        System.out.println("Задание 7");

        ageOfHuman = 18;
        if (ageOfHuman < 2)
            System.out.println("Если возраст человека равен "+ageOfHuman+", то ему никуда не нужно ходить :)");
        else {
            if ( ageOfHuman <= 6)
                System.out.println("Если возраст человека равен "+ageOfHuman+" , то ему нужно ходить в детский сад.");
            else {
                if (ageOfHuman <= 18)
                    System.out.println("Если возраст человека равен "+ageOfHuman+" , то ему нужно ходить в школу.");
                else {
                    if (ageOfHuman<24)
                        System.out.println("Если возраст человека равен "+ageOfHuman+" , то ему нужно ходить в университет.");
                    else {
                        if (ageOfHuman == 24)
                            System.out.println("Если возраст человека равен "+ageOfHuman+" , то в задаче не указанно куда ему нужно ходить:)");
                        else  {
                            System.out.println("Если возраст человека равен "+ageOfHuman+" , то ему нужно ходить на работу.");
                        }

                    }
                }
            }
        }

        //Задача 8
        System.out.println("Задание 8");

        //Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        // Если взрослого нет, то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        // Напишите программу, которая выводит в консоль сообщение о том,
        // можно ли ребенку кататься одному или в сопровождении взрослого в зависимости от того, сколько ему лет.

        int ageOfChild = 14;
        boolean isAvailableAdult =true;

        if (ageOfChild< 5)
            System.out.println("Если ребенку "+ageOfChild+" , то он не может кататься на аттракционе.");
        else {
            if (ageOfChild == 5 || ageOfChild == 14)
                System.out.println("Если ребенку "+ageOfChild+" ,в задаче не указано, можно или нет");
            else {
                if (ageOfChild<14)
                    {
                    if (isAvailableAdult)
                        System.out.println("Если ребенку " + ageOfChild + " , то он может кататься на аттракционе в сопровождении взрослого.");
                    else
                        System.out.println("Если ребенку " + ageOfChild + " , то он не может кататься на аттракционе без сопровождения взрослого.");
                    }
                else {
                    System.out.println("Если ребенку "+ageOfChild+" , то он может кататься на аттракционе без сопровождения взрослого.");
                        }
                    }
            }

        //Задача 9
        System.out.println("Задание 9");

        //С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бОльшее и выводит результат в консоль.
        int one = 3;
        int two = 5;
        int free = 2;
        int maximum = 0;

        if ( one>two )
            maximum=one;
        else
            maximum=two;

        if (free>maximum)
            maximum=free;

        System.out.println("Из чисел "+one+","+two+","+free+" Большее число: "+maximum);

    }
}