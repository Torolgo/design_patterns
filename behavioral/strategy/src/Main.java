void main() {
    Commande commande1 = new Commande("Nathan", 50.0, 10.0, new LivraisonStandard());
    Commande commande2 = new Commande("Loic", 100.0, 20.0, new LivraisonExpress());
    Commande commande3 = new Commande("Romain", 30.0, 5.0, new ClickAndCollect());

    System.out.println("--- Commandes initiales ---");
    commande1.afficherDetails();
    System.out.println();
    commande2.afficherDetails();
    System.out.println();
    commande3.afficherDetails();

    System.out.println("\n--- Changement de stratégie (Démonstration du pattern) ---");
    System.out.println("Le client Loic trouve la livraison Express trop chère...");

    commande2.setStrategieLivraison(new LivraisonStandard());

    System.out.println("Nouveau calcul pour Loic (Livraison Standard) :");
    commande2.afficherDetails();
}