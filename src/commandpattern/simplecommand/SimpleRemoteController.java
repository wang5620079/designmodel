package commandpattern.simplecommand;

import commandpattern.Command;

/**
 * Created by wp-pc on 2018/9/17.
 */
public class SimpleRemoteController {
    Command command;

    public SimpleRemoteController() {
    }

    public SimpleRemoteController(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonpressed(){
        command.execute();
    }
}
