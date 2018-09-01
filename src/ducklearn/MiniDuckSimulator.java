package ducklearn;

import ducklearn.behavior.FlyRocketPower;

public class MiniDuckSimulator {

    public static void main(String[] args) {
//        Duck mallard = new MallarDuck();
//        mallard.performFly();
//        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPower());
        model.performFly();
    }
}
