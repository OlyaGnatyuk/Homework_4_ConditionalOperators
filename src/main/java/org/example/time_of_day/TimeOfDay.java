package org.example.time_of_day;

public class TimeOfDay {
    private static final int CURRENT_HOUR = 8;

    public static void main(String[] args) {
        if (CURRENT_HOUR >= 4 && CURRENT_HOUR < 11) {
            System.out.println("Утро");
        } else if (CURRENT_HOUR >= 11 && CURRENT_HOUR < 17) {
            System.out.println("День");
        } else if (CURRENT_HOUR >= 17 && CURRENT_HOUR < 22) {
            System.out.println("Вечер");
        } else if ((CURRENT_HOUR >= 22  && CURRENT_HOUR < 24) || (CURRENT_HOUR >= 0 && CURRENT_HOUR < 4)) {
            System.out.println("Ночь");
        }
    }
}
