import java.util.ArrayList;

public class BurgerFastRestaurant {
    private ArrayList<ClientVip> clientVips = new ArrayList<>();

    public void ajouterClientVip(ClientVip clientVip) {
        clientVips.add(clientVip);
    }

    public void supprimerClientVip(ClientVip clientVip) {
        clientVips.remove(clientVip);
    }

    public void notifierClientVips(Promotion promotion) {
        for (ClientVip clientVip : clientVips) {
            clientVip.recevoirNotification(promotion.code, promotion.pourcentageRemise);
        }
    }
}
