package beverage.component;

import beverage.component.Beverage;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description
 * @since 2018/9/3
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        mDescription = "HouseBlend";
    }

    @Override
    public float cost() {
        return 0.89F;
    }
}
