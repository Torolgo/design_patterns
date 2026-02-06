public class Sandwich {
    private String pain;
    private String viande;
    private String fromage;
    private String legumes;
    private String sauce;
    private Boolean grille;

    public Sandwich(String pain){
        this.pain = pain;
    };

    public String getPain() {
        return pain;
    }
    public void setPain(String pain) {
        this.pain = pain;
    }
    public String getViande() {
        return viande;
    }
    public void setViande(String viande) {
        this.viande = viande;
    }
    public String getFromage() {
        return fromage;
    }
    public void setFromage(String fromage) {
        this.fromage = fromage;
    }
    public String getLegumes() {
        return legumes;
    }
    public void setLegumes(String legumes) {
        this.legumes = legumes;
    }
    public String getSauce() {
        return sauce;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public Boolean getGrille() {
        return grille;
    }
    public void setGrille(Boolean grille) {
        this.grille = grille;
    }
    public void showIngredients() {
        System.out.println("--- Détails du Sandwich ---");
        System.out.println("Pain : " + (pain != null ? pain : "Non spécifié"));
        System.out.println("Viande : " + (viande != null ? viande : "Aucune"));
        System.out.println("Fromage : " + (fromage != null ? fromage : "Aucun"));
        System.out.println("Légumes : " + (legumes != null ? legumes : "Aucun"));
        System.out.println("Sauce : " + (sauce != null ? sauce : "Aucune"));
        System.out.println("Grillé : " + (grille != null && grille ? "Oui" : "Non"));
        System.out.println("---------------------------");
    }
}
