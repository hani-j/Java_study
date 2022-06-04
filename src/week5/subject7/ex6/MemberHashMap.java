package week5.subject7.ex6;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap hashMap;

    public MemberHashMap() {
        hashMap = new HashMap();
    }

    public void addMember(Member memberLee) {
        hashMap.put(memberLee.getMemberId(), memberLee);
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); // key 만 처리
        while (ir.hasNext()){
            int key = ir.next();
            System.out.println(hashMap.get(key));
        }
        System.out.println();
    }

    public void removeMember(int i) {
        if (hashMap.containsKey(i))
            hashMap.remove(i);
    }
}
