package ex11;

import ex11.color.BlueColor;
import ex11.color.RedColor;
import ex11.color.YellowColor;
import ex11.shape.Circle;
import ex11.shape.Shape;

/**
 * 목적 : 두 클래스 계층을 연결하는 것
 * 1. 추상화와 구현의 분리
 * 2. 독립적인 클래스 계층구조 단순화
 */


public class App {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape redSquare = new Circle(new RedColor());

        redCircle.draw();
        redSquare.draw();

        System.out.println("==================");


        Shape blueCircle = new Circle(new BlueColor());
        Shape blueSquare = new Circle(new BlueColor());

        blueSquare.draw();
        blueCircle.draw();

        System.out.println("==================");
        Shape yellowCircle = new Circle(new YellowColor());
        Shape yellowSquare = new Circle(new YellowColor());

        yellowSquare.draw();
        yellowCircle.draw();
    }
}
