package beverage;

import beverage.component.Beverage;
import beverage.decorator.CondimentDecorator;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description
 * @since 2018/9/3
 */
public class Whip extends CondimentDecorator {
    Beverage mBeverage;

    public Whip(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Whip";
    }

    @Override
    public float cost() {
        return mBeverage.cost() + 0.10F;
    }
}
