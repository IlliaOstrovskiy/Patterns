package behavior_patterns.command.order;

public class Order {
    private String name;

    public Order(String meat) {
        this.name = meat;
    }

    public String getName() {
        return name;
    }
}
