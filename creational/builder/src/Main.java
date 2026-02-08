void main() {
    Sandwich sandwich = new BuilderSandwich("baguette")
            .setViande("jambon")
            .setFromage("emmental")
            .setLegumes("salade")
            .setSauce("mayonnaise")
            .setGrille(true)
            .build();
    System.out.println(sandwich);

    Sandwich sandwich2 = new BuilderSandwich("pain de mie")
            .setViande("poulet")
            .setFromage("cheddar")
            .setLegumes("tomate")
            .setSauce("ketchup")
            .setGrille(false)
            .build();
    System.out.println(sandwich2);

    Sandwich sandwich3 = new BuilderSandwich("baguette")
            .setViande("canard")
            .setFromage("roquefort")
            .setSauce("sauce au poivre")
            .setGrille(true)
            .build();
    System.out.println(sandwich3);
}
