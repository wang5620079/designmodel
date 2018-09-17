package commandpattern.simplecommand;

import commandpattern.Command;

/**
 * Created by wp-pc on 2018/9/17.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
