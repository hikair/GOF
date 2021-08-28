package adapter.classadapter;

/**
 * 适配器类
 * @author 35147
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    public int output5V() {
        // 获取到220V电压
        int srcV = output220V();
        // 转成5V
        int dstV = srcV / 44;
        return dstV;
    }
}