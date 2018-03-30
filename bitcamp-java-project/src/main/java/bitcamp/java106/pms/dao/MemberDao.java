package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Member;

public class MemberDao {
    private LinkedList<Member> collection = new LinkedList<>();
    
    public void insert(Member member) {
        this.collection.add(member);
    }
    
    public Member[] list() {
        Member[] arr = new Member[this.collection.size()];
        for (int i = 0; i < this.collection.size(); i++)
            arr[i] = this.collection.get(i);
        return arr;
    }
    
    public Member get(String id) {
        int index = getMemberIndex(id);
        if (index < 0)
            return null;
        return collection.get(index);
    }
    
    public void update(Member member) {
        int index = getMemberIndex(member.getId());
        if (index < 0)
            return;
        collection.set(index, member);
    }
    
    public void delete(String id) {
        int index = getMemberIndex(id);
        if (index < 0)
            return;
        collection.remove(index);
    }
    
    // 다음 메서드는 내부에서만 사용할 것이기 때문에 공개하지 않는다.
    private int getMemberIndex(String id) {
        for (int i = 0; i < collection.size(); i++) {
            Member originMember = collection.get(i);
            if (originMember.getId().toLowerCase().equals(
                    id.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}

//ver 14 - MemberController로부터 데이터 관리 기능을 분리하여 MemberDao 생성.





