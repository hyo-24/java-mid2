package generic.test.ex1;

public class Container <T> {

    private T item;


    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isEmpty() { // 안이 지금 비었는지 아닌지 확인하는 메서드
       return item == null;
    }

}
