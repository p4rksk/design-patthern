package ex04;

/**
 * 목적: 문지기를 메모리에 하나만 올리고 싶다.
 */

public class Doorman {

    static Doorman instance = new Doorman(); //instance는 static의 저장  new Doorman()은 힙에 저장

    private Doorman() {
    }

    public void 쫓아내(Animal a) {
        System.out.println(a.getName() + " 쫓아내");
    }
}
