package factory.factorymethod.pizza;

/**
 * @author 35147
 */
public abstract class Pizza {
    /**
     * 名字
     */
    protected String name;

    public Pizza(String name){
        this.name = name;
    }

    /**
     * 准备原材，不同的披萨不一样，因此需要抽象方法
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking");
    }

    public void cut(){
        System.out.println(name + " cutting");
    }

    public void box(){
        System.out.println(name + " boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
