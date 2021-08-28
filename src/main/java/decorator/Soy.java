package decorator;

/**
 * 具体的Decorator,这里就是调味品
 * @author 35147
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆 ");
        // 调味品的价格
        setPrice(1.5f);
    }
}
