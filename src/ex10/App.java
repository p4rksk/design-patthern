package ex10;


public class App {
    public static void main(String[] args) {
        Command alramCommand = new AlramCommand(new Alram());
        Command lampCommand = new LampCommand(new Lamp());
        Button alramButton = new Button(alramCommand);
        Button lampButton = new Button(lampCommand);

        alramButton.press();
        lampButton.press();
    }
}