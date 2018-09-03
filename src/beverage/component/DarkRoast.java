package beverage.component;

import beverage.component.Beverage;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description
 * @since 2018/9/3
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        mDescription = "DarkRoast";
    }

    @Override
    public float cost() {
        return 0.99F;
    }
}
