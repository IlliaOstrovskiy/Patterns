package structural_patterns.adapter.adapt;

import structural_patterns.adapter.model.Circle;
import structural_patterns.adapter.model.Square;

public class CircleToSquareAdapter{
    public static Square convertToSquare(Circle circle){
        return new Square(circle.getRadius() * 2);
    }
}