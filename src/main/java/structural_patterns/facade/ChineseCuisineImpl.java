package structural_patterns.facade;

public class ChineseCuisineImpl implements ChineseCuisine {
    @Override
    public void boiledChickenWithSauce() {
        /* 准备材料; 加工材料; 烹饪; 装盘 */
        System.out.println("白切鸡");
    }

    @Override
    public void sizzlingBeefSteak() {
        /* 准备材料; 加工材料; 烹饪; 装盘 */
        System.out.println("铁板牛肉");
    }

    @Override
    public void kungPaoChicken() {
        /* 准备材料; 加工材料; 烹饪; 装盘 */
        System.out.println("宫保鸡丁");
    }
}
