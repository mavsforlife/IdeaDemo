package ducklearn.behavior;

public class FlyRocketPower implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
