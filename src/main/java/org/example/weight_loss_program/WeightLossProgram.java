package org.example.weight_loss_program;

public class WeightLossProgram {
    private static final int LIMIT_OF_CALORIES = 1400;

    public static void main(String[] args) {
        proposeDinner(800);
    }

    private static void proposeDinner(int caloriesConsumed) {
        int chocolate = 340;
        int porridge = 250;
        int pieceOfBacon = 500;
        int possibleCalories = LIMIT_OF_CALORIES - caloriesConsumed;
        System.out.println("Съесть можно:");

        if (possibleCalories >= pieceOfBacon) {
            System.out.println("кусок сала или тарелку каши или шоколадку");
        } else if (possibleCalories >= chocolate) {
            System.out.println("тарелку каши или шоколадку");
        } else if (possibleCalories >= porridge) {
            System.out.println("тарелку каши");
        } else {
            System.out.println("ничего. Лимит калорий на сегодня исчерпан!");
        }
    }
}
