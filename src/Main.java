import strategypattern.model.behivior.FlyWithWings;
import strategypattern.model.behivior.Quack;
import strategypattern.model.MallardDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck(new FlyWithWings(),new Quack());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
