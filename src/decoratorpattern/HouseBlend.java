package decoratorpattern;

/**
 * Created by wp-pc on 2018/9/15.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="House Blend 咖啡";
    }
    public double cost(){
        return 0.89;
    }
}
