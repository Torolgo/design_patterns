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
            String[] colonne = lecteurCSV.getColonnes(i);
            String[] prixQuantite = colonne[2].split("x");
            double prix = Double.parseDouble(prixQuantite[0].trim());
            int quantite = Integer.parseInt(prixQuantite[1].trim());
            totalVente += prix * quantite;
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
        for (int i = 1; i < lecteurCSV.getNbLignes(); i++) {
            String[] colonne = lecteurCSV.getColonnes(i);
            String[] prixQuantite = colonne[2].split("x");
            String produit = colonne[1];
            double prix = Double.parseDouble(prixQuantite[0].trim());
            int quantite = Integer.parseInt(prixQuantite[1].trim());
            caParProduit.put(produit, (prix * quantite));
        }
        return caParProduit;
    }
}