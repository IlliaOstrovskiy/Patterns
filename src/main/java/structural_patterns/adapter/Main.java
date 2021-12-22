package structural_patterns.adapter;

import structural_patterns.adapter.adapt.CircleToSquareAdapter;
import structural_patterns.adapter.adapt.SquareToCircleAdapter;
import structural_patterns.adapter.model.Circle;
import structural_patterns.adapter.model.Shape;
import structural_patterns.adapter.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(4);
        System.out.println(shape);
        shape = CircleToSquareAdapter.convertToSquare((Circle) shape);
        System.out.println(shape);
        shape = new Square(6);
        System.out.println(shape);
        shape = SquareToCircleAdapter.convertToSquare((Square) shape);
        System.out.println(shape);
    }
}