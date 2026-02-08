public class CommandeValidationFacade {
    public static void validerCommande(String nomUtilisateur, String[] ingredients, String temps, String nomLivreur, String addresse) {
        boolean UtilisateurValide = UtilisateurVerificationService.verificationUtilisateur(nomUtilisateur);
        boolean ingredientsValides = IngredientVerificationService.verificationIngredient(ingredients);
        boolean tempsValide = TempsVerificationService.verificationTempsPreparation(temps);
        boolean livreurValide = LivreurVerificationService.verificationLivreur(nomLivreur);
        boolean AddresseValide = LivraisonVerificationService.verificationLivraisonAdresse(addresse);
        boolean CommandeValide = UtilisateurValide && ingredientsValides && tempsValide && livreurValide && AddresseValide;

        if (CommandeValide) {
            System.out.println("La commande est valide et prête à être traitée.");
        } else {
            System.out.println("La commande n'est pas valide. Veuillez vérifier les informations fournies.");
        }
    }
}
