package step11.ex12;
// 
public class Exam03_1 {
    static class Member {
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);
        
        if (m1 == m2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }
        System.out.println(m1.toString());
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
    }
}
