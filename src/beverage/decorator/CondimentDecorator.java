package beverage.decorator;

import beverage.component.Beverage;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @since 2018/9/3
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
