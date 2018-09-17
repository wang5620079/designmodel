package commandpattern.simplecommand;

import commandpattern.Command;

/**
 * Created by wp-pc on 2018/9/17.
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command cmd = new LightOnCommand(light);
        SimpleRemoteController receiver = new SimpleRemoteController();
        receiver.setCommand(cmd);
        receiver.buttonpressed();
    }
}
