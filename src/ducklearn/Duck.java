package ducklearn;

import ducklearn.behavior.IFlyBehavior;
import ducklearn.behavior.IQuackBehavior;

/**
 * 策略模式学习
 */
public abstract class Duck {
    protected IQuackBehavior mQuackBehavior;
    protected IFlyBehavior mFlyBehavior;

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void performFly() {
        mFlyBehavior.fly();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        mFlyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        mQuackBehavior = qb;
    }
}
