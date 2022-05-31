package week5.subject7.ex5;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        // comparable interface 를 구현하지 않았다는 error
        MemberTreeSet memberTreeSet = new MemberTreeSet();
        Member memberKim = new Member(1003, "김유신");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1002, "강감찬");
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKang);
        memberTreeSet.showAllMember();
    }
}
