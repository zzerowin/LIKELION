class Main {
    public static void main(String[] args) {
        // 정수가 실수 화 되어서 들어간다.
        // 5가 5.0이 되어서 들어간다.
        double d = 5;

        // `칼 리모콘`이 `무기 리모콘`화 되어서 들어간다.

        // 실제 처리
        // 무기 a무기 = (무기)new 칼();
        // (무기) => 무기리모콘 화
        무기 a무기 = new 칼();

        a무기.공격();
        // 출력 : 칼로 공격합니다.
    }
}

// 리모콘 전용 클래스
class 무기 {
    // 버튼 전용 메서드(함수)
    void 공격() {

    }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}

// static은 this를 사용할 수 없다
// 사람 is 동물 ( o ) 사람은 동물이다. *is => extends
// 동물 is 사람 ( x ) 동물은 사람이다.

// 클래스는 다른 클래스로 부터 변수와, 메서드를 복사 받을 수 있다.
// 복수해 주는 클래스를 부모 클래스
// 복사 받는 클래스는 자식 클래스
// 위 행위를 상속이라고 한다.
// 상속은 두 클래스가 A is B 관계임을 자바에게 알려준다.
// 클래스로 할 수 있는 3가지 => 변수 생성, 객체 생성, 리모콘 생성
// 메서드가 쓰이는 2가지 상황 : 객체에서는 기능
//  -                   : 리모콘에서는 버튼
// 사람 a사람;
//  - 'a사람' 이라는 변수에는 오직! 사람 리ㅁ콘만 들어 올 수 있다.
//  - '사람' 이라는 변수는 오직 사람 객체와 연결될 수 있다.
// 상속으로는 단순한 중복을 해결할 수 있지만, 복잡한 중복은 해결할 수 없다. => 구성을 배워야 한다.
// 다중상속은 불가능하다.
// 소프트웨어의 객체지향 기법, 좋은 설계 기법, 디자인 패턴 등은 오직 중복소스코드를 합리적으로 없애기 위해서 존재한다.
// 중복이 왜 안좋은가?
//  - 나중에 변경사항이 생길 때, 바꿔야 하는게 많아진다.
//  - 중복이 많은 코드는, 쉬운코드 => 실수
//  - 중복이 많다. => 객체지향 기법 도입