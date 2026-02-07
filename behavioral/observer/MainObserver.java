void main() {
    BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

    ClientVip client1 = new ClientVip("Romain");
    ClientVip client2 = new ClientVip("Loic");
    ClientVip client3 = new ClientVip("Nathan");

    restaurant.ajouterClientVip(client1);
    restaurant.ajouterClientVip(client2);
    restaurant.ajouterClientVip(client3);

    Promotion promotion = new Promotion("PROMO20", 20.0);
    restaurant.notifierClientVips(promotion);

    restaurant.supprimerClientVip(client1);

    Promotion promotion2 = new Promotion("PROMO30", 30.0);
    restaurant.notifierClientVips(promotion2);
}