package decoratorpattern;

/**
 * Created by wp-pc on 2018/9/15.
 */
public class Espresso extends  Beverage{
    public Espresso(){
        description="Espresso";
    }
    public double cost(){
        return 1.99;
    }
}
