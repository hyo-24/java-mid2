package generic.ex3;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        HospitalV2<Dog> dogHospital = new HospitalV2<>(); // ✅ 제네릭과 다형성을 함께 사용
        HospitalV2<Cat> catHospital = new HospitalV2<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

    }
}
