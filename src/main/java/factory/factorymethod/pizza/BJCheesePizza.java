package factory.factorymethod.pizza;

/**
 * @author 35147
 */
public class BJCheesePizza extends Pizza {

    public BJCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备BJCheesePizza");
    }
}
