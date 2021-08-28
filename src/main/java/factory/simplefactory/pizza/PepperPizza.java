package factory.simplefactory.pizza;

/**
 * @author 35147
 */
public class PepperPizza extends Pizza {

    public PepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备PepperPizza");
    }
}
