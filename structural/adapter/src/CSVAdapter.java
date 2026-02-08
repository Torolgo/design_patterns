import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {
    private final LecteurCSV lecteurCSV;

    public CSVAdapter(String nomFichier) {
        this.lecteurCSV = new LecteurCSV(nomFichier);
    }

    @Override
    public double getTotalVentes() {
        double totalVente = 0;

        for (int i = 1; i < lecteurCSV.getNbLignes(); i++) {
            totalVente += calculerMontantLigne(i);
        }
        return totalVente;
    }

    @Override
    public int getNbCommandes() {
        return lecteurCSV.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new java.util.HashMap<>();
        try {
             for (int i = 1; i < lecteurCSV.getNbLignes(); i++) {
                String[] colonne = lecteurCSV.getColonnes(i);
                String produit = colonne[1];
                double montantLigne = calculerMontantLigne(i);
                caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + montantLigne);
            }
        } catch (Exception e) {
            System.err.println("Erreur lors du calcul du CA par produit : " + e.getMessage());
        }
        return caParProduit;
    }

    private double calculerMontantLigne(int index) {
        try {
            String[] colonne = lecteurCSV.getColonnes(index);
            String[] prixQuantite = colonne[2].split("x");
            double prix = Double.parseDouble(prixQuantite[0].trim());
            int quantite = Integer.parseInt(prixQuantite[1].trim());
            return prix * quantite;

        } catch (Exception e) {
            System.err.println("Erreur de lecture à la ligne " + index + " : " + e.getMessage());
            return 0.0;
        }
    }
}