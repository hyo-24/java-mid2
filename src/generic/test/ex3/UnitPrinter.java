package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Shuttle;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t) { // Shuttle<T> 는 호출하는 곳에서 지정한 타입을 말한다. 이 타입이어야 t가 메서드에서 쓰일 수 있다.
        T unit = t.out();
        System.out.println("이름 : "+unit.getName()+", HP : "+unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t0) { // 매개변수 타입은 인자의 조건이라고 생각하면 된다.
        BioUnit unit = t0.out();
        System.out.println("이름 : "+unit.getName()+", HP : "+unit.getHp());
    }
}
