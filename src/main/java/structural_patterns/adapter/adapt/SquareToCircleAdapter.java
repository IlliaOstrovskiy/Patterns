package structural_patterns.adapter.adapt;

import structural_patterns.adapter.model.Circle;
import structural_patterns.adapter.model.Square;

public class SquareToCircleAdapter {

    public static Circle convertToSquare(Square square){
        return new Circle(square.getSide()/2);
    }
}