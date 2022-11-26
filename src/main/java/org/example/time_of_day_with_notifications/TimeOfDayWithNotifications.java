package org.example.time_of_day_with_notifications;

public class TimeOfDayWithNotifications {
    private static final int CURRENT_HOUR = 23;

    public static void main(String[] args) {
        if (CURRENT_HOUR >= 4 && CURRENT_HOUR < 11) {
            System.out.println("Утро");
        } else if (CURRENT_HOUR >= 11 && CURRENT_HOUR < 17) {
            System.out.println("День");
        } else if (CURRENT_HOUR >= 17 && CURRENT_HOUR < 22) {
            System.out.println("Вечер");
        } else if ((CURRENT_HOUR >= 22  && CURRENT_HOUR < 24) || (CURRENT_HOUR >= 0 && CURRENT_HOUR < 4)) {
            System.out.println("Ночь");
        } else if (CURRENT_HOUR < 0) {
            System.out.println("Время суток нужно ввести правильно");
        } else if (CURRENT_HOUR > 23) {
            System.out.println("Вернитесь с другой планеты на Землю");
        }
    }
}
