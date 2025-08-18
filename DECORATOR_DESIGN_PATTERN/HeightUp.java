package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN;

public class HeightUp extends  CharacterDecorator{

    public HeightUp(Character character){
        super(character);
    }

    @Override
    public String getDetail() {
        return character.getDetail() + " With HeightUP ";
    }
}
