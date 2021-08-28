package decorator;

/**
 * @author 35147
 */
public abstract class Drink {

    /**
     * 描述
     */
    public String des;

    /**
     * 价格
     */
    private float price = 0.0f;

    /**
     * 计算费用的抽象方法
     * @return
     */
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
