package week4.subject6.ex2;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("고객 대기 시간을 줄이기 위해 상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.");
    }
}
