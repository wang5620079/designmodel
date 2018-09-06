package strategypattern;

import strategypattern.behivior.FlyWithWings;
import strategypattern.behivior.Quack;
import strategypattern.model.MallardDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck(new FlyWithWings(),new Quack());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
