package factory.simplefactory.order2;

/**
 * 相当于客户端，发起订购
 * @author 35147
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
        System.out.println("程序退出");
    }
}
