package beverage.component;
/**
 * @author Victor
 * @Email wwmdirk@gmail.com
 * @since 2018/9/3
 * @Description 装饰者模式学习
 */

public abstract class Beverage {

    String mDescription = "Unknown Beverage";

    public String getDescription() {
        return mDescription;
    }
    public abstract float cost();
}
