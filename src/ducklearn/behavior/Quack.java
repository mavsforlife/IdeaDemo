package ducklearn.behavior;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack! quack!");
    }
}
