package decorator;

/**
 * 被装饰者缓冲层
 * @author 35147
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
