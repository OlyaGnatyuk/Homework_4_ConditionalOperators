package org.example.attraction;

public class Attraction {
    private static final int BORDER_HEIGHT_IN_CM = 160;

    public static void main(String[] args) {
        if (isAllowedToVisitAttraction(false, 160)) {
            System.out.println("Добро пожаловать на аттракцион!");
        } else {
            System.out.println("Без родителей проходить нельзя");
        }
    }

    private static boolean isAllowedToVisitAttraction(boolean parent, int height) {
        if (parent) {
            return true;
        } else if (height >= BORDER_HEIGHT_IN_CM) {
            return true;
        }

        return false;
    }
}
