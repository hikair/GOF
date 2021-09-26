package mediator;

public abstract class Mediator {

    /**
     * 将同事对象加入到集合中
     * @param colleagueName
     * @param colleague
     */
    public abstract void register(String colleagueName, Colleague colleague);

    /**
     * 接收同事对象发出的消息，并处理
     * @param stateChange
     * @param colleagueName
     */
    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();

}
