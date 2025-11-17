package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) { // Object 타입으로 값을 저장하고 꺼낼 때 자식 타입으로 꺼내는 코드

        // Integer 타입
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        // String 타입
        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = "+str);

        // 잘못된 타입의 인수 전달 시 (Integer 타입에 String 타입도 포함시켜버림)
        integerBox.set("문자100"); // 값을 저장할 때는 Object 로 둘다 가능하지만..!
        Integer result = (Integer) integerBox.get(); // 꺼낼 때 문제 발생 🚨
        System.out.println("result = "+result);
    }
}
