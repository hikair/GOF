package factory.simplefactory.pizza;

/**
 * @author 35147
 */
public class CheesePizza extends Pizza {

    public CheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备CheesePizza");
    }
}
