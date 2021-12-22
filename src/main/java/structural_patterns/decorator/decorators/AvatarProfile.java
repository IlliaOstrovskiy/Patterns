package structural_patterns.decorator.decorators;

import structural_patterns.decorator.components.Avatar;

public abstract class AvatarProfile extends Avatar {

    protected Avatar avatar;

    public AvatarProfile(Avatar avatar) {
        this.avatar = avatar;
    }
}
