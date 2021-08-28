package factory.absfactory.pizza;

/**
 * @author 35147
 */
public class BJPepperPizza extends Pizza {

    public BJPepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("准备BJPepperPizza");
    }
}
