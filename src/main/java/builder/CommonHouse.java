package builder;

/**
 * 普通房子
 * @author 35147
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子打砌墙");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子打封顶");

    }
}
