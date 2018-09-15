package decoratorpattern;

/**
 * Created by wp-pc on 2018/9/15.
 */
public class StartBuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" cost:"+beverage.cost());

        Beverage beverage1= new Espresso();
        beverage1.setSize(Beverage.tallsize);
        beverage1 =  new Macha(beverage1);
        beverage1 = new Macha(beverage1);
        beverage1 = new Macha(beverage1);
        System.out.println(beverage1.getDescription()+" cost"+beverage1.cost());

    }


}
