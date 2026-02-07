void main() {
    BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

    ClientVip client1 = new ClientVip("Romain");
    ClientVip client2 = new ClientVip("Loic");
    ClientVip client3 = new ClientVip("Nathan");

    restaurant.ajouterClientVip(client1);
    restaurant.ajouterClientVip(client2);
    restaurant.ajouterClientVip(client3);

    restaurant.creerPromotion("PROMO20", 20.0);

    restaurant.supprimerClientVip(client1);

    restaurant.creerPromotion("PROMO30", 30.0);
}