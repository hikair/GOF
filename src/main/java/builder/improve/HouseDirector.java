package builder.improve;

/**
 * 指挥者，这里去指定制作流程，返回产品
 * @author 35147
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    /**
     * 通过构造器传入houseBuilder
     * @param houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter 传入houseBuilder
     * @param houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何处理建造房子的流程，交给指挥者
     * @return
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
