public class LivraisonVerificationService {
    public static boolean verificationLivraisonAdresse(String addresseLivraison) {
        System.out.println("Vérification que l’adresse soit dans le périmètre de livraison...");

        if (addresseLivraison != null && addresseLivraison.toLowerCase().contains("toulouse")) {
            System.out.println("Adresse de livraison validée : " + addresseLivraison);
            return true;
        } else {
            System.err.println("Erreur : Adresse hors zone de livraison (Seul Toulouse est desservi).");
            return false;
        }
    }
}