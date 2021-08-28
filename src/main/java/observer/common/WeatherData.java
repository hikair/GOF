package observer.common;

/**
 * 核心类
 * 1.包含最新的天气情况
 * 2.含有CurrentConditions 对象
 * 3.当数据有更新时，就主动的调用CurrentConditions对象update方法（含display），这样他们（接入方）就会看到最新的信息
 * @author 35147
 */
public class WeatherData {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void dataChange() {
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    /**
     * 当数据有更新时，就调用setData
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}


