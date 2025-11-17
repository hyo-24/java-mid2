package generic.ex1;

public class IntegerBox { // 숫자를 보관하고 꺼낼 수 있는 단순한 기능을 제공함

    private Integer value; // ✅ Integer => int 의 래퍼 클래스

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
}
