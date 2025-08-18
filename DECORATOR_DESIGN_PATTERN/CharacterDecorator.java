package DESIGN_PATTERN.DECORATOR_DESIGN_PATTERN;

abstract class CharacterDecorator implements Character {

    Character character;


    public CharacterDecorator( Character character){
        this.character = character;
    }
}
