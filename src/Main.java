// Домашка 1.8 Методы
public class Main
{
    public static void checkYear (int year){
        if (year%4 != 0) {
            System.out.println(year + " не високосный год");
        }
        else{
            if (year%400 ==0){
                System.out.println(year + " високосный год");}
            else if (year%100 ==0){
                System.out.println(year + " не високосный год");}
            else {
                System.out.println(year + " високосный год");}
        }
    }

    public static void checkOSAndYear (int clientOS, int clientDeviceYear){
        if (clientOS==0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");}
        }
        else if (clientOS==1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }
    }

    public static int returnDays (int deliveryDistance){
        int days;
        if (deliveryDistance<20){
            days = 1;
            return days;

        }
        else if (deliveryDistance<60){
            days = 2;
            return days;

        }
        else {
            days =3;
            return days;
        }
    }

    public static void main(String[] args) {
        // Задача 1
        int year = 2022;
        checkYear(year);

        // Задача 2
        int clientDeviceYear = 2012;
        int clientOS = 0;
        checkOSAndYear(clientOS, clientDeviceYear);

        //Задача 3
        int deliveryDistance = 95;
        int needDays = returnDays(deliveryDistance);
        System.out.println("Для доставки на расстояние " + deliveryDistance + " км. потребуется дней: " + needDays);
    }
}

