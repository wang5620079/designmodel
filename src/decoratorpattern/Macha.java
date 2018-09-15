package decoratorpattern;

/**
 * Created by wp-pc on 2018/9/15.
 */
public class Macha extends CondimentDecorator {
    Beverage beverage;
    public Macha(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }


    public double cost(){
        switch (beverage.getSize()){
            case Beverage.tallsize:
                return 0.20*0.1 + beverage.cost();
            case Beverage.grandesize:
                return 0.20*0.5 + beverage.cost();
            case Beverage.ventisize:
                return 0.20 + beverage.cost();
        }
        return 0.20*0.5 + beverage.cost();
    }
}
