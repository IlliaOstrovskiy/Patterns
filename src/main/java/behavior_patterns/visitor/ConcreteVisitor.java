package behavior_patterns.visitor;

import behavior_patterns.visitor.elements.ElementA;
import behavior_patterns.visitor.elements.ElementB;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ElementA elementA) {
        System.out.println(elementA.getData());
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println(elementB.getData());
    }
}
