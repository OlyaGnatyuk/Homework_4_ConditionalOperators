package org.example.ideal_weight;

public class IdealWeight {
    private static final int HEIGHT_PER_CM = 175;
    private static final int WEIGHT_PER_KG = 70;

    public static void main(String[] args) {
        double idealWeight = (HEIGHT_PER_CM - 100) * 0.9;
        double leftBorder = idealWeight - 5;
        double rightBorder = idealWeight + 5;

        if ((WEIGHT_PER_KG >= leftBorder) && (WEIGHT_PER_KG <= rightBorder)) {
            System.out.println("Идеальный вес!");
        } else {
            System.out.println("Неидеальный вес...");
        }
    }
}
