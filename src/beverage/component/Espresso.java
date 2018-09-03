package beverage.component;

import beverage.component.Beverage;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description
 * @since 2018/9/3
 */
public class Espresso extends Beverage {

    public Espresso() {
        mDescription = "Espresso";
    }

    @Override
    public float cost() {
        return 1.99F;
    }
}
