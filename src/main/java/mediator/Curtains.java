package mediator;

public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void upCurtains() {
        System.out.println("开始升窗帘");
    }

    public void downCurtains() {
        System.out.println("开始降窗帘");
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }
}
