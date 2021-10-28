package strategy;

import strategy.impl.BadFlyBehavior;
import strategy.impl.ToyDuck;
import strategy.impl.WildDuck;

public class Client {

    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        // 切换策略
        wildDuck.setFlyBehavior(new BadFlyBehavior());
        wildDuck.fly();
    }

}
