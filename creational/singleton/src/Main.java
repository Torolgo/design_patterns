void main() {
    System.out.println("Caissier 1 : Nouvelle transaction en cours...");
    TPE.getInstance().nouvelleTransaction(15.0);

    System.out.println("Caissier 2 : Nouvelle transaction en cours...");
    TPE.getInstance().nouvelleTransaction(55.50);

    System.out.println("Caissier 3 : Nouvelle transaction en cours...");
    TPE.getInstance().nouvelleTransaction(9.50);

    // On affiche le chiffre d'affaires total
    double totalJour1 = TPE.getInstance().getChiffreAffaires();
    System.out.println("Chiffre d'affaires total validé : " + totalJour1 + "€");

    // Jour suivant on reset le chiffre d'affaires
    TPE.getInstance().reset();

    // Vérification que le reset a fonctionné
    System.out.println("Chiffre d'affaires au démarrage : " + TPE.getInstance().getChiffreAffaires() + "€");

    // Test d'une nouvelle transaction après reset
    System.out.println("Caissier 1 : Nouvelle transaction en cours...");
    TPE.getInstance().nouvelleTransaction(10.0);
    System.out.println("Nouveau total J2 : " + TPE.getInstance().getChiffreAffaires() + "€");
}
