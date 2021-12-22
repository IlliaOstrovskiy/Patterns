package structural_patterns.facade;

public class Menu {

    private ChineseCuisine chineseCuisine;
    private FrenchCuisine frenchCuisine;
    private ItalyCuisine italyCuisine;

    public Menu() {
        chineseCuisine = new ChineseCuisineImpl();
        frenchCuisine = new FrenchCuisineImpl();
        italyCuisine = new ItalyCuisineImpl();
    }

    public void boiledChickenWithSauce() {
        chineseCuisine.boiledChickenWithSauce();
    }

    public void sizzlingBeefSteak() {
        chineseCuisine.sizzlingBeefSteak();
    }

    public void kungPaoChicken() {
        chineseCuisine.kungPaoChicken();
    }


    public void bouillabaisse() {
        frenchCuisine.bouillabaisse();
    }

    public void cassoulet() {
        frenchCuisine.cassoulet();
    }

    public void pouleAuPot() {
        frenchCuisine.pouleAuPot();
    }

    public void lasagneWithTomatoAndCheese() {
        italyCuisine.lasagneWithTomatoAndCheese();
    }

    public void prawnRisotto() {
        italyCuisine.prawnRisotto();
    }

    public void creamCaramel() {
        italyCuisine.creamCaramel();
    }

}
