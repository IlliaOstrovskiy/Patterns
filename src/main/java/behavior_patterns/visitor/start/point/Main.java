package behavior_patterns.visitor.start.point;


import behavior_patterns.visitor.ConcreteVisitor;
import behavior_patterns.visitor.elements.Element;
import behavior_patterns.visitor.elements.ElementA;
import behavior_patterns.visitor.elements.ElementB;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        List<Element> elements = new ArrayList<>();
        elements.add(new ElementA());
        elements.add(new ElementB());

        for(Element element : elements){
            element.accept(concreteVisitor);
        }
    }
}
