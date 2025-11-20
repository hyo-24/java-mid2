package generic.ex3;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        HospitalV1 dogHospital = new HospitalV1(); // ✅ 제네릭 없이 다형성만 사용
        HospitalV1 catHospital = new HospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();
        //매개변수에 cat이 들어가도 컴파일러는 타입을 확인하지 못하기 때문에 런타임 오류가 발생할 수 있다.

        catHospital.set(cat);
        catHospital.checkup();

    }
}
