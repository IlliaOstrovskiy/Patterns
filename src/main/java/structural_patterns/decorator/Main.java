package structural_patterns.decorator;

import structural_patterns.decorator.components.Avatar;
import structural_patterns.decorator.components.Druid;
import structural_patterns.decorator.components.Knight;
import structural_patterns.decorator.decorators.Defender;
import structural_patterns.decorator.decorators.Fighter;
import structural_patterns.decorator.decorators.Magician;

public class Main {
    public static void main(String[] args) {
        Avatar john = new Knight();
        Avatar katy = new Druid();

        john = new Fighter(john);
        john = new Defender(john);
        katy = new Magician(katy);
        System.out.println(john.getDescription());
        System.out.println(katy.getDescription());
    }
}
