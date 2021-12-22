package structural_patterns.facade;

public class FrenchCuisineImpl implements FrenchCuisine {
    @Override
    public void bouillabaisse() {
        System.out.println("马赛鱼汤");
    }

    @Override
    public void cassoulet() {
        System.out.println("豆焖肉");
    }

    @Override
    public void pouleAuPot() {
        System.out.println("法式炖鸡");
    }
}
