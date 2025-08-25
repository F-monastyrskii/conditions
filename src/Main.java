//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1st task-- 0-ios, 1-android
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else { //if убрано для облегчения задачи компилятора
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //2nd task 0 - iOS; 1 - Android
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //3rd task
        int year = 2021;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //4th task
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 100){
            System.out.println("Доставка не осуществляется");
        }else if (deliveryDistance >= 60 && deliveryDistance <=100) {
            (deliveryDays) += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            (deliveryDays) += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }else{
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        //5th task
        int monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12){
            System.out.println("Некорректно введен номер месяца. Допускается номер месяца от 1 до 12");
        }
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
        }
    }
}