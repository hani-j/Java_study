package week4.subject6.ex3;

public interface Buy {
    void buy();

    default void order(){
        System.out.println("구매 주문");
    }
}
