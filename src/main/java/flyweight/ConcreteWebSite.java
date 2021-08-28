package flyweight;

/**
 * @author 35147
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 共享的部门，内部状态
     * 网站发布的形式（类型）
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + "。" + user.getName() + "在使用中~~");
    }
}
