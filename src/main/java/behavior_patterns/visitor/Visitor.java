package behavior_patterns.visitor;

import behavior_patterns.visitor.elements.ElementA;
import behavior_patterns.visitor.elements.ElementB;

public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
}
