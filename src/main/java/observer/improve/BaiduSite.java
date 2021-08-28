package observer.improve;

/**
 * @author 35147
 */
public class BaiduSite implements Observer {
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
    @Override
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
        System.out.println("***百度网站 Today mTemperature: " + temperature + "***");
        System.out.println("***百度网站 Today mPressure: " + pressure + "***");
        System.out.println("***百度网站 Today mHumidity: " + humidity + "***");
    }
}
