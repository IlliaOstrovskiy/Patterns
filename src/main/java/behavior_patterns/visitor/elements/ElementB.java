package behavior_patterns.visitor.elements;

import behavior_patterns.visitor.Visitor;

public class ElementB implements Element{
    private String data = "Element B data";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getData() {
        return data;
    }
}
