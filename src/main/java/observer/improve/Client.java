package observer.improve;

/**
 * @author 35147
 */
public class Client {

    public static void main(String[] args) {

        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        Observer currentConditions = new CurrentConditions();

        // 注册到weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(new BaiduSite());

        // 测试
        System.out.println("通知各个注册的观察者");
        weatherData.setData(10,20,30);
    }

}
