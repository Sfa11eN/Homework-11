import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Тема Методы");
        System.out.println("Задание 1");
        yearCheck(1991);
        appVersion(1, 2019);
        printCardDeliveryDays(740);

    }

    public static void taskStrings() {
    }

    public static void yearCheck(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не является високосным.");

        }
        System.out.println("Задание 2");
    }

    public static void appVersion(int mobileOs, int mobileYear) {
        String mobileOsName;
        switch (mobileOs) {
            case 0:
                mobileOsName = "iOs";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "Неподдерживаемая ОС";

        }
        int currentYear = LocalDate.now().getYear();
        if (mobileYear != currentYear) {
            System.out.println(" Для ОС " + mobileOsName + " установите Lite версию ");
        } else {
            System.out.println(" Для ОС " + mobileOsName + " установите обычную версию ");
        }
        System.out.println("Задание 3");
    }

    public static void printCardDeliveryDays(int distance) {
        int days = cardDeliveryDays(distance);
        if (days > 0) {
            System.out.println("Потребуется дней " + days);
        } else {
            System.out.println(" Доставка не осуществляется ");
        }
    }

    public static int cardDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}