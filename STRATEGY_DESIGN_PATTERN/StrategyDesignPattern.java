package DESIGN_PATTERN.STRATEGY_DESIGN_PATTERN;
/*Structure for Walkable Robot */


interface Walkable{
    void walk();
}

class NormalWalk implements Walkable{
    @Override
    public void walk() {
        System.out.println("Normal Walk");
    }
}

class NoWalk implements Walkable{

    @Override
    public void walk() {
        System.out.println("No Walk");
    }
}



/*Structure for TalkAble Robot*/

interface TalkAble{
    void talk();
}

class NormalTalk implements TalkAble{

    @Override
    public void talk() {
        System.out.println("Normal talk");
    }
}

class NoTalk implements TalkAble{

    @Override
    public void talk() {
        System.out.println("No Talk");
    }
}

/*Structure for Flyable Robot*/

interface FlyAble{

    void fly();

}

class NormalFly implements FlyAble{

    @Override
    public void fly() {
        System.out.println("Normal Fly");
    }
}

class Nofly implements FlyAble{

    @Override
    public void fly() {
        System.out.println("NoFly");
    }
}

abstract class ROBOT {

    Walkable walkable;

    FlyAble flyAble;

    TalkAble talkAble;

    public ROBOT(Walkable walkable , FlyAble flyAble ,TalkAble talkAble){
        this.flyAble = flyAble;
        this.talkAble = talkAble;
        this.walkable = walkable;
    }
    public void walk(){
        walkable.walk();
    }

    public void talk(){
        talkAble.talk();
    }

    public void fly(){
        flyAble.fly();
    }

    public abstract void projection();

}

/// ------Concreate Robot Types

class companionRobot extends ROBOT{
   public companionRobot(Walkable walkable , FlyAble flyAble, TalkAble talkAble){
       super(walkable,flyAble,talkAble);
   }

    @Override
    public void projection() {
        System.out.println("The Companion Robot Has Look Like This.");
    }
}

class WorkerRobot extends ROBOT{
    public WorkerRobot(Walkable w, FlyAble f,TalkAble t){
        super(w , f,t);
    }

    @Override
    public void projection() {
        System.out.println("The Worker Robot Look Like This.");
    }
}

public class StrategyDesignPattern{

    public static void main(String[] args) {
        ROBOT robot1 = new companionRobot(new NormalWalk(), new NormalFly(), new NormalTalk());
        robot1.walk();
        robot1.talk();
        robot1.fly();

        /*Worker Robot*/

        System.out.println();
        System.out.println("Second Robot\n");

        ROBOT robot2 = new WorkerRobot(new NormalWalk(), new Nofly(), new NoTalk());
        robot2.fly();
        robot2.talk();
        robot2.walk();
    }
}
