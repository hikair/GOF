package factory.absfactory.order;

import factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 35147
 */
public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = factory;
        do{
            orderType = getOrderType();
            pizza = factory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
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
