package visitor;

/**
 * @author 35147
 */
public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
