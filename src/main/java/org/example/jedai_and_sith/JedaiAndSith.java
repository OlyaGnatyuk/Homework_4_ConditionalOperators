package org.example.jedai_and_sith;

public class JedaiAndSith {

    private static final String JEDAI_OBIVAN = "ObiVan";
    private static final String SITH_PALPATIN = "Palpatin";
    private static final String SITH_DARTMOL = "DartMol";

    public static void main(String[] args) {
        if (willJedaiWin("ObiVan", "Palpatin", 150, 160)) {
            System.out.println("Победит Джедай");
        } else {
            System.out.println("Победит Ситх");
        }
    }

    private static boolean willJedaiWin(String jedaiName, String sithName, int jedaiHeight, int sithHeight) {
        if (SITH_PALPATIN.equalsIgnoreCase(sithName)) {
            return false;
        } else if (SITH_DARTMOL.equalsIgnoreCase(sithName) && JEDAI_OBIVAN.equalsIgnoreCase(jedaiName)) {
            return true;
        } else if (jedaiHeight != sithHeight) {
            return true;
        } else {
            return false;
        }
    }
}
