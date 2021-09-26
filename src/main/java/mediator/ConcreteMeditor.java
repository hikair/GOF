package mediator;

import java.util.HashMap;

public class ConcreteMeditor extends Mediator {

    private HashMap<String, Colleague> colleagueMap = new HashMap<>();

    private HashMap<String, String> interMap = new HashMap<>();

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        Colleague colleague = colleagueMap.get(colleagueName);
        if (colleague instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV) colleagueMap.get(interMap.get("TV"))).startTv();
            } else {
                ((TV) colleagueMap.get(interMap.get("TV"))).stopTv();
            }
        } else if (colleague instanceof CoffeeMachine) {
            ((Curtains) colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        } else if (colleague instanceof TV) {
            if (stateChange == 0) {
                ((Curtains) colleagueMap.get(interMap.get("Curtains"))).downCurtains();
            }
        }
    }

    @Override
    public void sendMessage() {

    }
}
