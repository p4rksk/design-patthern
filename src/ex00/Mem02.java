package ex00;

/**
 * 목표: 다형성, 동적 바인딩
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 == 객체) == 자동차(추상)
 */

abstract class Car {
    abstract void run();

}

class Sonata extends Car {

    @Override
        //재정의
    void run() {
        System.out.println("소나타 달린다.");
    }
}

class Genesis extends Car {

    @Override
        //재정의
    void run() {
        System.out.println("제네시스 달린다.");
    }
}


public class Mem02 {
    public static void main(String[] args) {
        Car sonata = new Sonata(); //메모리 sonata, car
        sonata.run(); //car의 run을 호출하러갔다가, sonata가 run을 재정의해서 car의 run이 오버라이드(무효화)되고,sonata의  run이 호출된다.
        Car genesis = new Genesis(); //메모리 genesis(run), car(run)
        genesis.run(); //car의 run을 호출하러갓따가 genesis가 run을 재정의해서 car의 run이 ㅇ
    }
}
