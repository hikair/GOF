package factory.factorymethod.order;

import factory.factorymethod.pizza.BJCheesePizza;
import factory.factorymethod.pizza.BJPepperPizza;
import factory.factorymethod.pizza.Pizza;

/**
 * @author 35147
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza("BJCheese");
        }
        if("pepper".equals(orderType)){
            pizza = new BJPepperPizza("BJPepper");
        }
        return pizza;
    }
}
