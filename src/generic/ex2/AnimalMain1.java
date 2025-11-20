package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("가나디", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        // 다른 많은 코드들...
        Dog findDog = dogBox.get();
        System.out.println("findDog = "+ findDog);

          /*
           여기서 헷갈렸던 부분 : 왜 값을 저장하고 꺼내 사용하는 걸 클래스에 넣어서 하려고 할까?
           앞에서 객체지향에 대해 공부할 때 배웠던 내용이다. 변수로 하면 책임을 각각 져야하고, 그에 대한 행동도 메서드를 각각 만들어서
           호출해야하기 때문에 유지보수에도 안정성문제에서도 좋지 않다. 그래서 값을 저장하고 사용하는 기능을 하나로 묶어두는 클래스가 필요하다.
           이 클래스를 이용해서 값을 사용하는데, 이때 타입이 다르면 그 타입의 클래스를 다 일일이 만들어야한다. 중복되는 코드가 생겨서 비효율적
           이라서 타입을 적용할 수 있는 제네릭 클래스를 사용해서 중복 코드도 줄이고, 타입을 강제하는 기능으로 안전성도 챙기게 된다.
          */

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = "+findAnimal);
    }
}
