package mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startTv() {
        System.out.println("打开电视");
        sendMessage(0);
    }

    public void stopTv() {
        System.out.println("关闭电视");
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }
}
