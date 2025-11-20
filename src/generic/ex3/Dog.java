package generic.ex3;

import generic.animal.Animal;

public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }


    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
