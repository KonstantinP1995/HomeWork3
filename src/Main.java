public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        //Задача 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        //Задача 2
        int clientOs = 1;
        int clientDeviceYear = 2000;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        //Задача 3
        int year = 2024;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
    }

    public static void task4() {
        //Задача 4 (здесь напрашивается использование цикла, но пока не знаю как)
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay += 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay += 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }


    }

    public static void task5() {
     //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Время года - зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень");
                break;
            default:
                System.out.println("Такого номера месяца не существует");
        }
    }
}