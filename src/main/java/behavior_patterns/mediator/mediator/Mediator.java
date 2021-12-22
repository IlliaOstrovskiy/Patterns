package behavior_patterns.mediator.mediator;

import behavior_patterns.mediator.components.Component;

public interface Mediator {
    void registerComponent(Component component);
    void useComponentA();
    void useComponentB();
}
