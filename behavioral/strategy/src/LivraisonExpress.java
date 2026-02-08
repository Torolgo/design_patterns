public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFraisLivraison(double distance) {
        return 10 + (1 * distance);
    }
}
