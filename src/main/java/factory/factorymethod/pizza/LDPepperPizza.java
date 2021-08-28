package factory.factorymethod.pizza;

/**
 * @author 35147
 */
public class LDPepperPizza extends Pizza {

    public LDPepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备LDPepperPizza");
    }
}
