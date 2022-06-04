package week5.subject7.ex1;

public class GenericPrinter<T> {
    private T Material;

    public T getMaterial() {
        return Material;
    }

    public void setMaterial(T material) {
        Material = material;
    }

    @Override
    public String toString() {
        return "재료는 " +
                Material +
                " 입니다";
    }
}
