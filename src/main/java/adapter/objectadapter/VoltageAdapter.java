package adapter.objectadapter;

/**
 * 适配器类
 * @author 35147
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    /**
     * 通过构造器，传入Voltage220V
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    public int output5V() {
        int dst = 0;
        if(voltage220V != null){
            // 获取220V电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~");
            // 转成5V
            dst = src / 44;
        }
        return dst;
    }
}
