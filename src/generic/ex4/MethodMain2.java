package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("김율", 100);
        Cat cat = new Cat("김냄비", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("이누야샤", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
