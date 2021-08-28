package factory.simplefactory.order2;

import factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 35147
 */
public class OrderPizza {

    Pizza pizza = null;

    public OrderPizza() {
        // 用户输入
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = SimpleFactory.createPizza(orderType);
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
