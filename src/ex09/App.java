package ex09;

import ex09.student.HomeworkDelegator;
import ex09.student.HomeworkType;

/**
 * 델리게이트
 * 개념: 객체가 자신이 직접 일을 하는 것이 아닌 다른 객체에게 위임
 * 간략: 다른사람에게 일을 지시
 * <p>
 * 목표
 * 작업을 직접 수행하지 않고, 그 작업을 위임한다.
 * <p>
 * 작업 순서
 * 1. 규칙을 정한다. -> 어떤 과목인지 어떤 결과를 줘야하는지
 * 2. 학생을 고른다. -> 과학 학생, 수학 학생 등
 * 3. 숙제를 시킨다. -> 숙레르 하라고 한다.
 * <p>
 * 사용 이유
 * 효율적 : 직접 하기보다는 잘하는 인원에게 맡기면 빠르고 정확하다.
 * 유연성 : 일이 생기면 바로 맡길 수 있고, 새로운 친구에 맞는 숙제를 맡길 수 있다.
 */
public class App {
    public static void main(String[] args) {
        HomeworkDelegator homeworkDelegator = new HomeworkDelegator();

        // 1. 수학
        homeworkDelegator.delegateHomework(HomeworkType.MATH);

        // 2. 과학
        homeworkDelegator.delegateHomework(HomeworkType.SCIENCE);


    }
}
