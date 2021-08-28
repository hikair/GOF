package decorator;

/**
 * 咖啡店
 * @author 35147
 */
public class CoffeeBar {

    public static void main(String[] args) {
        // 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack

        // 1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述="+order.getDes());

        // 2.加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶费用=" + order.cost());
        System.out.println("order 加入一份牛奶描述="+order.getDes());

        // 3.加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份巧克力费用=" + order.cost());
        System.out.println("order 加入一份巧克力描述="+order.getDes());

        // 4.加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份巧克力费用=" + order.cost());
        System.out.println("order 加入一份巧克力描述="+order.getDes());
    }

}
