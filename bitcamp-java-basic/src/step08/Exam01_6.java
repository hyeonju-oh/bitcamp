package step08;
// 클래스 변수의 응용
public class Exam01_6 {
    static class Member {
        // 모든 인스턴스가 다음의 변수에 대해 같은 값을 가질 경우, 클래스 변수로 만드는 것이 바람직하다.
        // 만약 값을 저장하는 것이 아닌 조회하는 용도로만 사용하는 변수라면 대문자로 선언하여 상수임을 표현하라
        // 조회 용도로만 사용하기로 했으면 문법적으로 값을 변경하는 것을 막아라!
        // 보통 조회용으로 사용하는 변수는 공개해도 되기 때문에 public으로
        public final static int GUEST = 0;
        public final static int MEMBER = 1;
        public final static int MANAGER = 2;
        
        String id;
        String password;
        int type;
    }
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.id = "aaa";
        m1.password = "1111";
        m1.type = 0;
        
        Member m2 = new Member();
        m2.id = "bbb";
        m2.password = "2222";
        m2.type = 2;
        
        Member m3 = new Member();
        m3.id = "ccc";
        m3.password = "1111";
        m3.type = 1;
        
        // 회원의 타입을 지정할 때 숫자를 이용하였다.
        // 그런데 숫자의 의미는
        
        Member m4 = new Member();
        m4.id = "aaa";
        m4.password = "1111";
        m4.type = Member.GUEST;
        
        Member m5 = new Member();
        m5.id = "bbb";
        m5.password = "2222";
        m5.type = Member.MANAGER;
        
        Member m6 = new Member();
        m6.id = "ccc";
        m6.password = "1111";
        m6.type = Member.MEMBER;
          
    }
}
