package memento;

public class GameRole {

    /**
     * 攻击力
     */
    private Integer vit;

    /**
     * 防御力
     */
    private Integer def;

    public GameRole(Integer vit, Integer def) {
        this.vit = vit;
        this.def = def;
    }

    /**
     * 创建Memento，即根据当前的状态得到Memento
     * @return
     */
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    /**
     *从备忘录对象，恢复GameRole的状态
     * @param memento
     */
    public void recoverGameRole(Memento memento) {
        vit = memento.getVit();
        def = memento.getDef();
    }

    public void display() {
        System.out.println(String.format("游戏角色当前的攻击力：%s，防御力：%s", vit, def));
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
