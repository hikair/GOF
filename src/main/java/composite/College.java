package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 35147
 */
public class College extends OrganizationComponent {

    /**
     * list中存放的是Department
     */
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    /**
     * 构造器
     *
     * @param name 名字
     * @param des  描述
     */
    public College(String name, String des) {
        super(name, des);
    }

    /**
     * 重写add
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }

    /**
     * 重写remove
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }

    /**
     * print方法，就是输出University包含的学院
     */
    @Override
    protected void print() {
        System.out.println("----------------"+getName()+"---------------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

}
