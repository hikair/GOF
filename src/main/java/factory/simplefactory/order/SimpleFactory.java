package factory.simplefactory.order;

import factory.simplefactory.pizza.CheesePizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.PepperPizza;
import factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂类
 @author 35147
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        if("greek".equals(orderType)) {
            pizza = new GreekPizza("greek");
        }

        if("cheese".equals(orderType)) {
            pizza = new CheesePizza("cheese");
        }

        if("pepper".equals(orderType)) {
            pizza = new PepperPizza("pepper");
        }

        return pizza;
    }
}
