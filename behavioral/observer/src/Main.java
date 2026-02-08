void main() {
    BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

    ClientVip client1 = new ClientVip("Romain");
    ClientVip client2 = new ClientVip("Loic");
    ClientVip client3 = new ClientVip("Nathan");

    restaurant.ajouterAbonne(client1);
    restaurant.ajouterAbonne(client2);
    restaurant.ajouterAbonne(client3);

    restaurant.creerPromotion("PROMO20", 20.0);

    restaurant.supprimerAbonne(client1);

    restaurant.creerPromotion("PROMO30", 30.0);
}