package week2.subject3.ex2;

public class Company {
    private static Company instance = new Company(); // 유일하게 생성한 인스턴스
    private Company() {}

    // 외부에서 인스턴스를 참조할 수 있도록 public 메서드 구현
    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return  instance; // 유일하게 생성한 인스턴스 반환
    }
}
