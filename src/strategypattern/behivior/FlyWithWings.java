package strategypattern.behivior;

/**
 * Created by wp on 18-9-2.
 */
public class FlyWithWings implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("用翅膀飞！");
    }
}
