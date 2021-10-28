package strategy.impl;

import strategy.FlyBehavior;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("超会飞");
    }
}
