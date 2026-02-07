void main() {
    AnalyseurVentes analyseur = new CSVAdapter("structural/adapter/ventes.csv");
    BurgerAnalytics analytics = new BurgerAnalytics(analyseur);
    analytics.genererRapport();
}