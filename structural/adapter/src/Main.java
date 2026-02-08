void main() {
    AnalyseurVentes analyseur = new CSVAdapter("structural/adapter/src/ventes.csv");
    BurgerAnalytics analytics = new BurgerAnalytics(analyseur);
    analytics.genererRapport();
}