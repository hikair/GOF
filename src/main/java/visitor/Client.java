package visitor;

/**
 * @author 35147
 */
public class Client {

    public static void main(String[] args) {
        // 创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man("Bob"));
        objectStructure.attach(new Woman("Jodi"));

        // 成功
        Success success = new Success("success");
        objectStructure.display(success);

        // 失败
        objectStructure.attach(new Man("Tom"));
        objectStructure.attach(new Man("Leo"));
        Fail fail = new Fail("fail");
        objectStructure.display(fail);
    }
}
