package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN;

public class GunPower extends CharacterDecorator{

    public GunPower(Character character){
        super(character);
    }

    @Override
    public String getDetail() {
        return character.getDetail() +  "Gun Power Of Mario";
    }
}
