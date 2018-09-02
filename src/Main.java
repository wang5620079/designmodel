import behivior.FlyWithWings;
import behivior.Quack;
import model.MallardDuck;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck(new FlyWithWings(),new Quack());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}
