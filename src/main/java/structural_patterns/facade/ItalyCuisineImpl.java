package structural_patterns.facade;

public class ItalyCuisineImpl implements ItalyCuisine {
    @Override
    public void lasagneWithTomatoAndCheese() {
        System.out.println("焗茄汁千层面");
    }

    @Override
    public void prawnRisotto() {
        System.out.println("虾仁烩饭");
    }

    @Override
    public void creamCaramel() {
        System.out.println("焦糖布丁");
    }
}
