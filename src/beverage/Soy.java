package beverage;

import beverage.component.Beverage;
import beverage.decorator.CondimentDecorator;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description
 * @since 2018/9/3
 */
public class Soy extends CondimentDecorator {
    Beverage mBeverage;

    public Soy(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        return 0.15F + mBeverage.cost();
    }
}
