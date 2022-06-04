package week5.subject7.ex2;

import java.util.ArrayList;
import java.util.List;

public class MemberArrayList {
    private ArrayList<Member> array;

    public MemberArrayList() {
        array = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        this.array.add(member);
    }

    public void showAllMember() {
        if (this.array.isEmpty())
            System.out.println("아무 정보 없음");
        else
            this.array.forEach(a ->
                System.out.println(a.toString()));
    }

    public void removeMember(int memberId) {
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getMemberId() == memberId)
                array.remove(i);
        }
    }
}
