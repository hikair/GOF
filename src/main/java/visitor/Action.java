package visitor;

/**
 * @author 35147
 */
public abstract class Action {

    /**
     * 评价名字
     */
    public String name;

    public Action(String name) {
        this.name = name;
    }

    /**
     * 得到男性的评价
     * @param man
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性的评价
     * @param woman
     */
    public abstract void getWomanResult(Woman woman);
}
