package mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMeditor();
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");
        alarm.sendAlarm(0);
    }

}
