package beverage.component;

import beverage.component.Beverage;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description
 * @since 2018/9/3
 */
public class Decat extends Beverage {

    public Decat() {
        mDescription = "Decat";
    }

    @Override
    public float cost() {
        return 1.05F;
    }
}
