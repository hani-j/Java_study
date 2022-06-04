package week5.subject7.ex6;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");
        Member memberHung = new Member(1004, "훙길동"); // 키는 중복x 값은 상관 없음
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);
        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberHung);
        memberHashMap.showAllMember();
        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
