package ducklearn;

import ducklearn.behavior.FlyWithWings;
import ducklearn.behavior.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallar duck");
    }
}
