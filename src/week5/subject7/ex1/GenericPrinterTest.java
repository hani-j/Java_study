package week5.subject7.ex1;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);
    }
}
