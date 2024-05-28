package ex04;

/**
 * 풀링 : Pooling (객체를 10개 유지하는 기법)
 */


public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
        Doorman doorman = Doorman.instance;
    }
}

