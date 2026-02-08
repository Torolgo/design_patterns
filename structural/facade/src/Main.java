void main() {
    System.out.println("Test de commande valide:");
    CommandeValidationFacade.validerCommande(
            "Michel Legrand",
            new String[]{"pain", "steak", "fromage", "laitue"},
            "15 minutes",
            "Marty Plantin",
            "123 Rue de la Marguerite, Toulouse"
    );
    System.out.println("Test de commande invalide:");
    CommandeValidationFacade.validerCommande(
            "Sophie Marceau",
            new String[]{"baguette", "jambon", "fromage", "salade"},
            "20 minutes",
            "Jean Dupont",
            "456 Avenue des Fleurs, Lyon"
    );
}