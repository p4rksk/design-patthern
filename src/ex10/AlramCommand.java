package ex10;

public class AlramCommand implements Command {

    private Alram alram;

    public AlramCommand(Alram alram) {
        this.alram = alram;
    }

    @Override
    public void execute() {
        alram.alramOn();
    }
}