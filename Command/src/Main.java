
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOnLightCommand ton = new TurnOnLightCommand(light);
        TurnOffLightCommand toff = new TurnOffLightCommand(light);

        RemoteControl rc = new RemoteControl();
        rc.addCommand(ton);
        rc.addCommand(toff);

        rc.pressButton(0);
        rc.pressButton(1);
    }
}