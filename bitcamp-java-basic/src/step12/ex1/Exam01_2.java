package step12.ex1;
// 객체(의 주소) 목록을 다루는 클래스 - 컬렉션 클래스(collection class) 정의
import java.util.ArrayList;
public class Exam01_2 {
    
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        
        print(list); // aaa, bbb, ccc, ddd,
        
        list.remove(2);
        print(list); // aaa, bbb, ddd,
        
        list.remove(0);
        print(list); // bbb, ddd,
        
        // 유효한 인덱스가 아니면 예외 발생시킨다!
        //list.remove(4); // 실행 오류!
        
        list.add(1, "xxx"); 
        print(list); // bbb, xxx, ddd,
        
        list.add(1, "yyy"); 
        print(list); // bbb, yyy, xxx, ddd,
        
        list.add(0, "zzz"); 
        print(list); // zzz, bbb, yyy, xxx, ddd,
        
        list.add(5, "ttt"); 
        print(list); // zzz, bbb, yyy, xxx, ddd, 
        
        list.set(1, "aaa"); // zzz, aaa, yyy, xxx, ddd, 
        print(list);
        
        list.add("ccc"); //zzz, aaa, yyy, xxx, ddd, ccc, 
        print(list);

    }

    static void print(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
