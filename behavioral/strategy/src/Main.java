void main() {
    System.out.println("Bienvenue dans le simulateur de commandes de burger en ligne !");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lancer le test avec interface CLI (1) ou en mode statique (2) ?");

    boolean continuer = true;
    while (continuer) {
        String choix = scanner.nextLine();
        switch (choix) {
            case "1" -> {
                MenuCLI.LancerTestCLI(scanner);
                continuer = false;
            }
            case "2" -> {
                LancerTestStatique();
                continuer = false;
            }
            default -> System.out.println("Choix invalide. Veuillez entrer '1' pour CLI ou '2' pour statique.");
        }
    }
}
private static void LancerTestStatique() {
    System.out.println("Test en mode statique...");
    Commande commande1 = new Commande("Nathan", 50.0, 10.0, new LivraisonStandard());
    Commande commande2 = new Commande("Loic", 100.0, 20.0, new LivraisonExpress());
    Commande commande3 = new Commande("Romain", 30.0, 5.0, new ClickAndCollect());

    System.out.println("--- Commandes initiales ---");
    commande1.afficherDetails();
    System.out.println();
    commande2.afficherDetails();
    System.out.println();
    commande3.afficherDetails();

    System.out.println("\n--- Changement du mode de livraison  ---");
    System.out.println("Le client Loic trouve la livraison Express trop chère...");

    commande2.setStrategieLivraison(new LivraisonStandard());

    System.out.println("Nouveau calcul pour Loic (Livraison Standard) :");
    commande2.afficherDetails();
}