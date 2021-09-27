package memento;

public class Memento {

    /**
     * 攻击力
     */
    private Integer vit;

    /**
     * 防御力
     */
    private Integer def;

    public Memento(Integer vit, Integer def) {
        this.vit = vit;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
