package factory.factorymethod.order;

import factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 35147
 */
public abstract class OrderPizza {

    /**
     * 定义一个抽象方法，createPizza，让各个工厂子类自己实现
     * @param orderType
     * @return
     */
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        // 用户输入
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("暂无该披萨");
                break;
            }

        }while (true);
    }


    private String getOrderType(){
        try {
            BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = sr.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
