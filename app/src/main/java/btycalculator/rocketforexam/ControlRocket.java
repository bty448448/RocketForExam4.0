package btycalculator.rocketforexam;

public class ControlRocket extends Rocket implements Touchable{
    private float targetX, targetY;
    public void touch(float targetX, float targetY){
        this.targetX = targetX;
        this.targetY = targetY;
        setVX(targetX - getX());
        setVY(targetY - getY());
        float d = getVel();
        setVX(getVX() * 5 / d);
        setVY(getVY() * 5 / d);
    }
    ControlRocket(){
        super();
    }
}

