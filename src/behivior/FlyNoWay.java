package behivior;

/**
 * Created by wp on 18-9-2.
 */
public class FlyNoWay  implements  FlyBehavior  {
    @Override
    public void fly() {
        System.out.println("不能飞!");
    }
}
