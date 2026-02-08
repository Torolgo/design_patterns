void main(){
    BurgerFactory burgerFactory = new BurgerFactory();

    Burger cheeseBurger = burgerFactory.createBurger(BurgerType.CHEESE);
    cheeseBurger.preparer();
    System.out.println("Prix : " + cheeseBurger.afficherPrix() + "€");

    Burger chickenBurger = burgerFactory.createBurger(BurgerType.CHICKEN);
    chickenBurger.preparer();
    System.out.println("Prix : " + chickenBurger.afficherPrix() + "€");

    Burger veggieBurger = burgerFactory.createBurger(BurgerType.VEGGIE);
    veggieBurger.preparer();
    System.out.println("Prix : " + veggieBurger.afficherPrix() + "€");
}