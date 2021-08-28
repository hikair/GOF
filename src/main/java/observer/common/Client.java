package observer.common;

/**
 * @author 35147
 */
public class Client {

    public static void main(String[] args) {
        // 创建接入方
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建WeatherData 并将 接入方currentConditions传递到WeatherData
        WeatherData weatherData = new WeatherData(currentConditions);

        // 更新天气情况
        weatherData.setData(20,30,40);

        System.out.println("====天气情况发生变化====");
        weatherData.setData(25,25,35);

    }

}
