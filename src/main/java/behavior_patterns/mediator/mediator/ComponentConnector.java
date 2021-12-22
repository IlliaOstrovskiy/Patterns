package behavior_patterns.mediator.mediator;

import behavior_patterns.mediator.components.Component;
import behavior_patterns.mediator.components.ComponentA;
import behavior_patterns.mediator.components.ComponentB;

public class ComponentConnector implements Mediator{

    private ComponentA componentA;
    private ComponentB componentB;

    @Override
    public void registerComponent(Component component) {
        switch (component.getName()){
            case "CompA" :
                componentA = (ComponentA) component;
                break;
            case "CompB" :
                componentB = (ComponentB) component;
                break;
        }
    }

    @Override
    public void useComponentA() {
        componentA.componentA_Action();
    }

    @Override
    public void useComponentB() {
        componentB.componentB_Action();
    }
}
