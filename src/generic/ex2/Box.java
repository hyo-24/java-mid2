package generic.ex2;

public class Box<T> { // ✅ 타입을 원하는 것으로 바꿔서 사용하기위해 거치는 무타입 객체 (제네릭 타입)

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
