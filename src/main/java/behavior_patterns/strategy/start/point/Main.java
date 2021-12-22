package behavior_patterns.strategy.start.point;

import behavior_patterns.strategy.shapes.Circle;
import behavior_patterns.strategy.shapes.Shape;
import behavior_patterns.strategy.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.showShapeName();

        shape = new Square();
        shape.showShapeName();
    }
}
