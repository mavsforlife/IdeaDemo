package beverage;

import beverage.component.Beverage;
import beverage.decorator.CondimentDecorator;

/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @Description Mocha 是一个装饰者，扩展自CondimentDecorator
 * @since 2018/9/3
 */
public class Mocha extends CondimentDecorator {

    /**
     * 被装饰者
     */
    Beverage mBeverage;

    /**
     * 作为参数传入构造器种，再由构造器将被装饰者记录在实例变量种
     * @param beverage 被装饰者
     */
    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    /**
     * 我们希望description不止描述本身，而是完整的带上装饰者
     * 所以首先利用委托的做法，得到一个description，在其后加上附加的叙述
     * @return
     */
    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return 0.20F + mBeverage.cost();
    }
}
