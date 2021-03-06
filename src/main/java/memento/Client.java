package memento;

public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole(100, 100);
        System.out.println("和boss大战前的状态");
        gameRole.display();

        // 把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大战");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("大战后，使用备忘录对象恢复到大战前");
        gameRole.recoverGameRole(caretaker.getMemento());
        gameRole.display();
    }

}
