package generic.test.ex3;


import generic.test.ex3.unit.BioUnit;

public class UnitUtil { // 제너릭 메서드 형식 잘 기억하기 무조건 Box<T> 같이 사용해야하는 것 아님 ❌

    public static <T extends BioUnit> T maxHp(T a, T b) { // 매개변수의 타입은 받은 인자가 메서드에서 사용하는 타입인지 검사하는 역할이다.
        return a.getHp() > b.getHp() ? a : b;
    }
}
