package generic.ex3;

import generic.animal.Animal;

public class Cat extends Animal {

    public Cat(String name, int size) {
        super(name, size);
    }


    @Override
    public void sound() { // 똑같은 코드인데 하나만 다른 코드라....
        System.out.println("냥냥");
    }

}
