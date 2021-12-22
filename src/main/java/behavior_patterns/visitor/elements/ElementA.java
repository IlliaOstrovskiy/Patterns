package behavior_patterns.visitor.elements;

import behavior_patterns.visitor.Visitor;

public class ElementA implements Element{
    private String data = "Element A data";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getData() {
        return data;
    }
}
