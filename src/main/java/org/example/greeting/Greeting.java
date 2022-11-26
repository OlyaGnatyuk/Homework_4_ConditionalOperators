package org.example.greeting;

public class Greeting {
    private static final int CURRENT_DAY = 7;
    private static final int CURRENT_HOUR = 4;

    public static void main(String[] args) {
        if (CURRENT_DAY < 1 || CURRENT_DAY > 7) {
            System.out.println("Текущий день введён неверно");
            return;
        }

        if (CURRENT_HOUR < 0 || CURRENT_HOUR > 23) {
            System.out.println("Текущий час введён неверно");
            return;
        }

        if ((CURRENT_DAY >= 0 && CURRENT_DAY < 6) && CURRENT_HOUR <= 8) {
            System.out.println("Доброе утро!");
        } else if ((CURRENT_DAY > 0 && CURRENT_DAY < 6) && (CURRENT_HOUR > 8 && CURRENT_HOUR <= 11)) {
            System.out.println("Всё пропало, ты проспал!");
        } else if ((CURRENT_DAY > 0 && CURRENT_DAY < 6) && CURRENT_HOUR > 11) {
            System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
        } else if ((CURRENT_DAY > 5 && CURRENT_DAY < 8) && CURRENT_HOUR <= 12) {
            System.out.println("Доброе утро!");
        } else if ((CURRENT_DAY > 5 && CURRENT_DAY < 8) && (CURRENT_HOUR > 12 && CURRENT_HOUR <= 16)) {
            System.out.println("Лучше поспать ещё");
        } else if ((CURRENT_DAY > 5 && CURRENT_DAY < 8) && (CURRENT_HOUR > 16 && CURRENT_HOUR <= 18)) {
            System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
        } else if ((CURRENT_DAY > 5 && CURRENT_DAY < 8) && CURRENT_HOUR > 18) {
            System.out.println("Дааа, с режимом надо что-то делать");
        }
    }
}
