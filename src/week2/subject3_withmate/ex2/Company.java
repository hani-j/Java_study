package week2.subject3_withmate.ex2;

public class Company {
    private Company() {
    }

    private static Company instance = new Company();

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
