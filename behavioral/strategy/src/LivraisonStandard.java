public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFraisLivraison(double distance) {
        return 5 + (0.5 * distance);
    }
}
