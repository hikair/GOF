package strategy.impl;

import strategy.Duck;

public class ToyDuck extends Duck {

    public ToyDuck() {
        super(new NoFlyBehavior());
    }
}
