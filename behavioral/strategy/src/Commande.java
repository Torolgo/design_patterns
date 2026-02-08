public class Commande {
    private String client;
    private double prix;
    private double distance;
    private StrategieLivraison strategieLivraison;

    public Commande(String client, double prix, double distance, StrategieLivraison moyenLivraison) {
        this.client = client;
        this.prix = prix;
        this.distance = distance;
        this.strategieLivraison = moyenLivraison;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public StrategieLivraison getStrategieLivraison() {
        return strategieLivraison;
    }
    public void setStrategieLivraison(StrategieLivraison strategieLivraison) {
        this.strategieLivraison = strategieLivraison;
    }

    public String getClient() {
        return client;
    }
    public void setClient(String client) {
        this.client = client;
    }

    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFraisLivraison(distance);
    }

    public double calculerPrixTotal() {
        return prix + calculerFraisLivraison();
    }

    public void afficherDetails() {
        System.out.println("Client: " + client);
        System.out.println("Prix de la commande: " + prix);
        System.out.println("Distance de livraison: " + distance);
        System.out.println("Frais de livraison: " + calculerFraisLivraison());
        System.out.println("Prix total: " + calculerPrixTotal());
    }
}
