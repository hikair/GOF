package factory.absfactory.order;

/**
 * @author 35147
 */
public class PizzaStore {
    public static void main(String[] args) {
        // new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
        System.out.println("程序退出");
    }
}
