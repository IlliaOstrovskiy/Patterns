package behavior_patterns.mediator.start.point;

import behavior_patterns.mediator.components.ComponentA;
import behavior_patterns.mediator.components.ComponentB;
import behavior_patterns.mediator.mediator.ComponentConnector;
import behavior_patterns.mediator.mediator.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ComponentConnector();
        mediator.registerComponent(new ComponentA());
        mediator.registerComponent(new ComponentB());

        mediator.useComponentA();
        mediator.useComponentB();
    }
}
