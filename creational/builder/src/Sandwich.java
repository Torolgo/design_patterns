public class Sandwich {
    private String pain;
    private String viande;
    private String fromage;
    private String legumes;
    private String sauce;
    private Boolean grille;

    public Sandwich(String pain){
        this.pain = pain;
    }

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
    @Override
    public String toString() {
        return "--- Détails du Sandwich ---\n" +
                "Pain : " + (pain != null ? pain : "Non spécifié") + "\n" +
                "Viande : " + (viande != null ? viande : "Aucune") + "\n" +
                "Fromage : " + (fromage != null ? fromage : "Aucun") + "\n" +
                "Légumes : " + (legumes != null ? legumes : "Aucun") + "\n" +
                "Sauce : " + (sauce != null ? sauce : "Aucune") + "\n" +
                "Grillé : " + (grille != null && grille ? "Oui" : "Non") + "\n" +
                "---------------------------";
    }
}
