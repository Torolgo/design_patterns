import java.util.ArrayList;

public class BurgerFastRestaurant {
    private ArrayList<ObservateurPromo> abonnes = new ArrayList<>();

    public void ajouterAbonne(ObservateurPromo abonne) {
        abonnes.add(abonne);
    }

    public void supprimerAbonne(ObservateurPromo abonne) {
        abonnes.remove(abonne);
    }

    public ArrayList<ObservateurPromo> getClientVips() {
        return abonnes;
    }

    public void notifierAbonne(Promotion promotion) {
        for (ObservateurPromo clientVip : abonnes) {
            clientVip.recevoirNotification(promotion.getCode(), promotion.getPourcentageRemise());
        }
    }

    public void creerPromotion(String codePromotion, double pourcentageRemise) {
        Promotion promotion = new Promotion(codePromotion, pourcentageRemise);
        notifierAbonne(promotion);
    }
}
