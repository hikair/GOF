package observer.common;

/**
 * 显示当前天气情况（可以理解为气象站自己的网站）
 * @author 35147
 */
public class CurrentConditions {

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

    /**
     * 更新天气情况，是由WeatherData 来调用，使用推送模式
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示
     */
    public void display() {
        System.out.println("Today mTemperature: " + temperature + "***");
        System.out.println("Today mPressure: " + pressure + "***");
        System.out.println("Today mHumidity: " + humidity + "***");
    }
}
