package builder.improve;

/**
 *  抽象的建造者
 * @author 35147
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 建墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 建造房子好，将产品（房子）返回
     * @return
     */
    public House buildHouse(){
        return house;
    }
}
