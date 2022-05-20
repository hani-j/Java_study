package week4.subject6.ex2;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");

        char alpa = (char)System.in.read();

        switch (alpa){
            case 'R', 'r':
                RoundRobin roundRobin = new RoundRobin();
                roundRobin.getNextCall();
                roundRobin.sendCallToAgent();
                break;
            case 'L', 'l':
                LeastJob leastJob = new LeastJob();
                leastJob.getNextCall();
                leastJob.sendCallToAgent();
                break;
            case 'P', 'p':
                PriorityAllocation priorityAllocation = new PriorityAllocation();
                priorityAllocation.getNextCall();
                priorityAllocation.sendCallToAgent();
                break;
            default:
                System.out.println("R, L, P 중에 입력해주세요.");
        }
    }
}
