package factory.simplefactory.pizza;

/**
 * @author 35147
 */
public class GreekPizza extends Pizza {

    public GreekPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备GreekPizza");
    }
}
