package observer.improve;

/**
 * 观察者接口
 * @author 35147
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);

}
