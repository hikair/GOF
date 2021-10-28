package strategy.impl;

import strategy.Duck;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new GoodFlyBehavior());
    }
}
