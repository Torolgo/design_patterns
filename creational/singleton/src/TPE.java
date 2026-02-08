public class TPE {
    private static TPE instance = null;
    private double chiffreAffaires;

    private TPE() {
        chiffreAffaires = 0;
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public static synchronized TPE getInstance() {
        if (instance == null) {
            instance = new TPE();
        }
        return instance;
    }
    public void reset() {
        chiffreAffaires = 0;
    }

    public void nouvelleTransaction(double montant) {
        System.out.println("Paiment Accepté");
        chiffreAffaires += montant;
    }
}
