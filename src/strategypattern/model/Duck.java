package strategypattern.model;

import strategypattern.behivior.FlyBehavior;
import strategypattern.behivior.QuackBehavior;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public void swim(){
        System.out.println("鸭子游泳！");
    }
    public void display(){
        System.out.println("我是一只鸭子！");
    }

    //执行呱呱叫动作
    public void performQuack(){
        quackBehavior.quack();
    }
    //执行飞行动作
    public void performFly(){
        flyBehavior.fly();
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
