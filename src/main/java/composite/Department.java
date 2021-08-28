package composite;

/**
 * @author 35147
 */
public class Department extends OrganizationComponent {
    /**
     * 构造器
     *
     * @param name 名字
     * @param des  描述
     */
    public Department(String name, String des) {
        super(name, des);
    }

    /**
     * add,remove就不用写了，因为它是叶子节点
     */
    @Override
    protected void print() {
        System.out.println(getName());
    }
}
