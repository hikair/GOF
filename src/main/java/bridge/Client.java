package bridge;

/**
 * 桥接模式
 * @author 35147
 */
public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式+品牌）
        // 折叠式小米手机
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("--------------");
        // 折叠式vivo手机
        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

        System.out.println("===============");
        // 直立式小米手机
        Phone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("--------------");
        // 直立式vivo手机
        Phone phone4 = new UpRightPhone(new Vivo());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
