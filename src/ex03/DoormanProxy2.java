package ex03;


public class DoormanProxy2 {

    private final Doorman doorman;//final을 붙이면 무조건 값이 있어야 됨

    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal a) {
        System.out.println("지갑 검사");
        doorman.쫓아내(a);
    }
}
