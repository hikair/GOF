package mediator;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startCoffee() {
        System.out.println("开始煮咖啡");
    }

    @Override
    public void sendMessage(int stateChange) {
        getMediator().getMessage(stateChange, name);
    }
}
