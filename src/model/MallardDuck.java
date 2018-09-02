package model;

import behivior.FlyBehavior;
import behivior.QuackBehavior;

//绿头鸭
public class MallardDuck  extends Duck{
    public MallardDuck(){
    }
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior=flyBehavior;
        this.quackBehavior=quackBehavior;
    }

    @Override
    public void swim() {
        System.out.println("绿头鸭游泳");
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
