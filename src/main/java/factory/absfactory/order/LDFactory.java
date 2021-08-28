package factory.absfactory.order;

import factory.absfactory.pizza.LDCheesePizza;
import factory.absfactory.pizza.LDPepperPizza;
import factory.absfactory.pizza.Pizza;

/**
 * 工厂子类
 * @author 35147
 */
public class LDFactory implements AbsFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza("LDCheesePizza");
        }
        if("pepper".equals(orderType)){
            pizza = new LDPepperPizza("LDPepperPizza");
        }
        return pizza;
    }
}
