package visitor;

/**
 * @author 35147
 */
public class Fail extends Action {
    public Fail(String name) {
        super(name);
    }

    @Override
    public void getManResult(Man man) {
        System.out.println(man.name+"给的评价是：fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.name+"给的评价是：fail");
    }
}
