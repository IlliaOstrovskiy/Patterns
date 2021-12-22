package behavior_patterns.command.executor;

import behavior_patterns.command.Cook;
import behavior_patterns.command.order.Order;

public class OrderExecutor implements ExecutorService<Order>{

    @Override
    public void execute(Order order) {
        Cook.cook(order);
    }
}
