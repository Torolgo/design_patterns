public class BurgerFactory {
    public Burger createBurger(BurgerType type) {
        switch (type) {
            case VEGGIE:
                return new BurgerVeggie();
            case CHEESE:
                return new CheeseBurger();
            case CHICKEN:
                return new ChickenBurger();
            default:
                throw new IllegalArgumentException("Type de burger inconnu: " + type);
        }
    }
}