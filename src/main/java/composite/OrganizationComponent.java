package composite;

/**
 * @author 35147
 */
public abstract class OrganizationComponent {

    /**
     * 名字
     */
    private String name;

    /**
     * 描述
     */
    private String des;

    /**
     * 添加
     * @param organizationComponent
     */
    protected void add(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    /**
     * 去除
     * @param organizationComponent
     */
    protected void remove(OrganizationComponent organizationComponent){
        // 默认实现
        throw new UnsupportedOperationException();
    }

    /**
     * 打印
     */
    protected abstract void print();

    /**
     * 构造器
     * @param name 名字
     * @param des 描述
     */
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
