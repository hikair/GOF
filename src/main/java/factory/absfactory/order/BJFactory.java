package factory.absfactory.order;

import factory.absfactory.pizza.BJCheesePizza;
import factory.absfactory.pizza.BJPepperPizza;
import factory.absfactory.pizza.Pizza;

/**
 * 工厂子类
 * @author 35147
 */
public class BJFactory implements AbsFactory{

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza("BJCheesePizza");
        }
        if("pepper".equals(orderType)){
            pizza = new BJPepperPizza("BJPepperPizza");
        }
        return pizza;
    }
}
