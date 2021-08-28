package factory.factorymethod.pizza;

/**
 * @author 35147
 */
public class LDCheesePizza extends Pizza {

    public LDCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备LDCheesePizza");
    }
}
