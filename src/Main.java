public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        //������ 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientOs == 1) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }
    }

    public static void task2() {
        //������ 2
        int clientOs = 1;
        int clientDeviceYear = 2000;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }
    }

    public static void task3() {
        //������ 3
        int year = 2024;
        if (year % 4 == 0) {
            System.out.println(year + " ��� �������� ����������");
        } else {
            System.out.println(year + " ��� �������� �� ����������");
        }
    }

    public static void task4() {
        //������ 4 (����� ������������� ������������� �����, �� ���� �� ���� ���)
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("����������� ����: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDay += 1;
            System.out.println("����������� ����: " + deliveryDay);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDay += 2;
            System.out.println("����������� ����: " + deliveryDay);
        }


    }

    public static void task5() {
     //������ 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("����� ���� - ����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("����� ���� - �����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����� ���� - ����!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("����� ���� �����");
                break;
            default:
                System.out.println("������ ������ ������ �� ����������");
        }
    }
}