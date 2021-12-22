package behavior_patterns.mediator.components;

import behavior_patterns.mediator.mediator.Mediator;

public interface Component {

    void setMediator(Mediator mediator);
    String getName();
}
