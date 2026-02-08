public class BuilderSandwich {
    private final Sandwich sandwich;

    public BuilderSandwich(String pain) {
        this.sandwich = new Sandwich(pain);
    }

    public BuilderSandwich setPain(String pain) {
        this.sandwich.setPain(pain);
        return this;
    }

    public BuilderSandwich setViande(String viande) {
        this.sandwich.setViande(viande);
        return this;
    }

    public BuilderSandwich setFromage(String fromage) {
        this.sandwich.setFromage(fromage);
        return this;
    }

    public BuilderSandwich setLegumes(String legumes) {
        this.sandwich.setLegumes(legumes);
        return this;
    }

    public BuilderSandwich setSauce(String sauce) {
        this.sandwich.setSauce(sauce);
        return this;
    }

    public BuilderSandwich setGrille(Boolean grille) {
        this.sandwich.setGrille(grille);
        return this;
    }

    public Sandwich build() {
        return this.sandwich;
    }

}
