package decorator;

/**
 * 具体的Decorator,这里就是调味品
 * @author 35147
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        // 调味品的价格
        setPrice(2.0f);
    }
}
