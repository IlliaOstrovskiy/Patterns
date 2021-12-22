package behavior_patterns.command.start.point;


import behavior_patterns.command.executor.ExecutorService;
import behavior_patterns.command.executor.OrderExecutor;
import behavior_patterns.command.order.Order;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = new OrderExecutor();
        executor.execute(new Order("Meat"));
    }
}
