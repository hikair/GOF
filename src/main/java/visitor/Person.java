package visitor;

/**
 * @author 35147
 */
public abstract class Person {

    public String name;

    /**
     * 给出的评价
     */
    public String assess = "";

    public Person(String name) {
        this.name = name;
    }

    /**
     * 提供一个方法，让访问者可以访问
     */
    public abstract void accept(Action action);

}
