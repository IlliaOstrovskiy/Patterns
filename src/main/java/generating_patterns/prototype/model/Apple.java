package generating_patterns.prototype.model;

public class Apple extends SmartPhone{
    public Apple(String model) {
        this.setPrice(900);
        this.setModel(model);
    }

    @Override
    public SmartPhone clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
