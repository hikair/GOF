package factory.absfactory.order;

import factory.absfactory.pizza.Pizza;

/**
 * 一个抽象工厂模式的抽象层（接口）
 * @author 35147
 */
public interface AbsFactory {

    /**
     * 让下面的工厂子类具体实现
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);
}
