package org.example.programmer_and_offers;

public class ProgrammerAndOffers {
    private static final int COMPENSATION_PER_MONTH_1 = 250000;
    private static final int COMPENSATION_PER_MONTH_2 = 270000;
    private static final int TIME_TO_WORK_AND_HOME_PER_DAY_1 = 4;
    private static final int TIME_TO_WORK_AND_HOME_PER_DAY_2 = 2;

    public static void main(String[] args) {
        double incomePerHour1 = COMPENSATION_PER_MONTH_1 / (23 * (8 + TIME_TO_WORK_AND_HOME_PER_DAY_1));
        double incomePerHour2 = COMPENSATION_PER_MONTH_2 / (23 * (8 + TIME_TO_WORK_AND_HOME_PER_DAY_2));
        if (incomePerHour2 > incomePerHour1) {
            System.out.println("Оффер №2 наиболее предпочтителен!");
        } else if (incomePerHour2 < incomePerHour1) {
            System.out.println("Оффер №1 наиболее предпочтителен!");
        } else {
            if (TIME_TO_WORK_AND_HOME_PER_DAY_1 < TIME_TO_WORK_AND_HOME_PER_DAY_2) {
                System.out.println("Оффер №1 наиболее предпочтителен!");
            } else if (TIME_TO_WORK_AND_HOME_PER_DAY_1 > TIME_TO_WORK_AND_HOME_PER_DAY_2) {
                System.out.println("Оффер №2 наиболее предпочтителен!");
            } else {
                System.out.println("Офферы идентичны");
            }
        }
    }
}
