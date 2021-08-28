package factory.simplefactory.order;

import factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 35147
 */
public class OrderPizza {
/*    public OrderPizza() {
        Pizza pizza = null;
        // 订购披萨的类型
        String orderType;

        do{
            orderType = getOrderType();
            if("greek".equals(orderType)) {
                pizza = new GreekPizza("greek");
            }else if("cheese".equals(orderType)){
                pizza = new CheesePizza("cheese");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);
    }*/

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    /**
     * 定义一个简单工厂对象
     */
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public void setFactory(SimpleFactory simpleFactory) {
        // 用户输入
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getOrderType();
            pizza = simpleFactory.createPizza(orderType);
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
