package ducklearn.behavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak! squeak!");
    }
}
