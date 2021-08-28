package command;

/**
 * @author 35147
 */
public class LightOnCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
