package behavior_patterns.visitor.elements;

import behavior_patterns.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
