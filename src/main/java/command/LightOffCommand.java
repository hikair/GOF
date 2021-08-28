package command;

/**
 * @author 35147
 */
public class LightOffCommand implements Command {
    /**
     * 聚合LightReceiver
     */
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
