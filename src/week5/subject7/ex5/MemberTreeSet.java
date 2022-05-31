package week5.subject7.ex5;

import java.util.TreeSet;

public class MemberTreeSet {

    private  TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public void showAllMember() {
        for (Member member : treeSet)
            System.out.println(member);
        System.out.println();
    }
}
