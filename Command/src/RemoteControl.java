import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }

    public void pressButton(int index) {
        if (index >= 0 && index < commands.size()) {
            commands.get(index).execute();
        } else {
            System.out.println("Invalid button index");
        }
    }
}
