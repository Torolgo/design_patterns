void main() {
    Commande commande1 = new Commande("Nathan", 50.0, 10.0, new LivraisonStandard());
    Commande commande2 = new Commande("Loic", 100.0, 20.0, new LivraisonExpress());
    Commande commande3 = new Commande("Romain", 30.0, 5.0, new ClickAndCollect());

    commande1.afficherDetails();
    System.out.println();
    commande2.afficherDetails();
    System.out.println();
    commande3.afficherDetails();
}