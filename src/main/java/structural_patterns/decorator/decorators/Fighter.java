package structural_patterns.decorator.decorators;

import structural_patterns.decorator.components.Avatar;

public class Fighter extends AvatarProfile {

    public Fighter(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return avatar.getDescription() + " Fighter";
    }

    @Override
    public int getPower() {
        return avatar.getPower() + 25;
    }

    @Override
    public void fight() {
        //use sword to attack an opponent
    }
}
