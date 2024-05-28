package ex03;

import ex03.lib.OuterRabbit;

public class App {
    public static void main(String[] args) {
        Animal rabbit = new RabbitAdapter(new OuterRabbit());
        DoormanProxy2 doorman = new DoormanProxy2(new Doorman());
        doorman.쫓아내(rabbit);
    }
}

