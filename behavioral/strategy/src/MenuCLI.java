import java.util.Scanner;

public class MenuCLI {
    public static void LancerTestCLI(Scanner scanner) {
        System.out.println("Test avec le menu CLI...");

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        int prix = choisirPrix(scanner);
        int distance = choisirDistance(scanner);
        StrategieLivraison strategie = choisirLivraison(scanner);
        Commande commande = new Commande(nom, prix, distance, strategie);

        System.out.println("\n--- Récapitulatif ---");
        commande.afficherDetails();

        System.out.print("\nSouhaitez-vous changer de mode de livraison pour comparer ? (O/n) : ");
        while (true) {
            String reponse = scanner.nextLine().trim().toLowerCase();
            if (reponse.equals("o") || reponse.isEmpty()) {
                strategie = choisirLivraison(scanner);
                commande.setStrategieLivraison(strategie);
                System.out.println("\n--- Nouveau Récapitulatif ---");
                commande.afficherDetails();
                break;
            } else if (reponse.equals("n")) {
                break;
            } else {
                System.out.print("Veuillez répondre par 'O' ou appuyer sur Enter pour oui ou 'n' pour non : ");
            }
        }

        System.out.println("\nMerci de votre commande !");
        scanner.close();
    }

    private static int choisirPrix(Scanner scanner) {
        System.out.print("Entrez le prix de votre commande : ");
        int prix;
        while (true) {
            try {
                prix = Integer.parseInt(scanner.nextLine().trim());
                if (prix > 0) {
                    return prix;
                } else {
                    System.out.println("Veuillez entrer un nombre positif pour le prix.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide, veuillez entrer un nombre.");
            }
        }
    }

    private static int choisirDistance(Scanner scanner) {
        System.out.print("Entrez la distance de livraison en km : ");
        int distance;
        while (true) {
            try {
                distance = Integer.parseInt(scanner.nextLine().trim());
                if (distance > 0) {
                    return distance;
                } else {
                    System.out.println("Veuillez entrer un nombre positif pour la distance.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide, veuillez entrer un nombre.");
            }
        }
    }

    private static StrategieLivraison choisirLivraison(Scanner scanner) {
        System.out.println("Choisissez un mode de livraison :");
        System.out.println("1. Livraison standard (5€ + 0.5€/km)");
        System.out.println("2. Livraison express (10€ + 1€/km)");
        System.out.println("3. Livraison ClickAndCollect (0€)");

        int choix;
        while (true) {
            System.out.print("Votre choix (1-3) : ");
            try {
                choix = Integer.parseInt(scanner.nextLine().trim());
                if (choix >= 1 && choix <= 3) {
                    return switch (choix) {
                        case 2 -> new LivraisonExpress();
                        case 3 -> new ClickAndCollect();
                        default -> new LivraisonStandard();
                    };
                } else {
                    System.out.println("Veuillez entrer un nombre entre 1 et 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide, veuillez entrer un nombre.");
            }
        }
    }
}