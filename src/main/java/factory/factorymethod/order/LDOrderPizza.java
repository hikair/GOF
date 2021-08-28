package factory.factorymethod.order;

import factory.factorymethod.pizza.LDCheesePizza;
import factory.factorymethod.pizza.LDPepperPizza;
import factory.factorymethod.pizza.Pizza;

/**
 * @author 35147
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza("LDCheese");
        }
        if("pepper".equals(orderType)){
            pizza = new LDPepperPizza("LDPepper");
        }
        return pizza;
    }
}
