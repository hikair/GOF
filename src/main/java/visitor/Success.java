package visitor;

/**
 * @author 35147
 */
public class Success extends Action {
    public Success(String name) {
        super(name);
    }

    @Override
    public void getManResult(Man man) {
        System.out.println(man.name+"给的评价是：success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.name+"给的评价是：success");
    }
}
