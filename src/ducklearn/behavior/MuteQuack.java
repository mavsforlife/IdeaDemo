package ducklearn.behavior;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("do nothing! can't quack!");
    }
}
