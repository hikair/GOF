package strategy.impl;

import strategy.FlyBehavior;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这波飞，给1分");
    }
}
