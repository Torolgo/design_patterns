void main() {
    Sandwich sandwich = new BuilderSandwich("baguette")
            .setViande("jambon")
            .setFromage("emmental")
            .setLegumes("salade")
            .setSauce("mayonnaise")
            .setGrille(true)
            .build();
    sandwich.showIngredients();

    Sandwich sandwich2 = new BuilderSandwich("pain de mie")
            .setViande("poulet")
            .setFromage("cheddar")
            .setLegumes("tomate")
            .setSauce("ketchup")
            .setGrille(false)
            .build();
    sandwich2.showIngredients();

    Sandwich sandwich3 = new BuilderSandwich("baguette")
            .setViande("canard")
            .setFromage("roquefort")
            .setSauce("sauce au poivre")
            .setGrille(true)
            .build();
    sandwich3.showIngredients();
}
