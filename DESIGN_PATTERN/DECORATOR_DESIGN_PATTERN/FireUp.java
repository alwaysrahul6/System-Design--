package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN;

public class FireUp extends CharacterDecorator{

    public FireUp(Character character){
        super(character);
    }

    @Override
    public String getDetail() {
        return character.getDetail() + "Fire Up Mario";
    }
}.  
