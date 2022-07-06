/* 가정
우리는 게임개발회사에 입사했다.
우리에게는 성격좋은 사수 한명이 있다.
내가 개발할 게임은 오리시뮬레이션 게임이다.
선임이 나의 개발을 도와주진 않지만 조언은 해준다.
*/

/* 요구사항
- D8 요구 : 자바에서 다중상속은 불가능 합니다. 상속에는 한계가 있습니다. 상속을 사용하지 않고 고무오리계열의 중복을 제거해주세요.
*/

class Main {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

abstract class 오리 {
    비행아이템 a비행아이템;

    오리() {
        a비행아이템 = new 날개비행아이템();
    }

    void 날다() {
        a비행아이템.작동();
    }
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 {
    고무오리() {
        a비행아이템 = new 못나는비행아이템();
    }
}

class 고무2오리 extends 오리 {
    고무2오리() {
        a비행아이템 = new 못나는비행아이템();
    }
}

abstract class 비행아이템 {
    abstract void 작동();
}

class 날개비행아이템 extends 비행아이템 {
    void 작동() {
        System.out.println("날개로 날아갑니다.");
    }
}

class 못나는비행아이템 extends 비행아이템 {
    void 작동() {
        System.out.println("저는 못 날아요 ㅠㅠ");
    }
}