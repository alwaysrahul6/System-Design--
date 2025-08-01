package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN;

public class Starpower extends CharacterDecorator{

    public Starpower(Character character){
        super(character);
    }

    @Override
    public String getDetail() {
        return character.getDetail() + "Star Power Of Mario";
    }
}
