package generic.ex3;

import generic.animal.Animal;

public class HospitalV2<T extends Animal> {

    /* 제네릭만 사용할 경우 T 만으로는 컴파일러가 타입을 알 수가 없다. 이럴 경우 컴파일러는 Object 타입으로 검사.
     아래의 getName(), getSize() 같은 메서드는 Object 에 선언되어있지 않기 때문에 컴파일 오류가 난다. */

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: "+animal.getName());
        System.out.println("동물 크기: "+animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
