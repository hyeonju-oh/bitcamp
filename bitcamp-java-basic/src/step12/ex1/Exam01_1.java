package step12.ex1;
// 객체(의 주소) 목록을 다루는 클래스 - 컬렉션 클래스(collection class) 정의
public class Exam01_1 {

// 배열을 이용하여 컬렉션 클래스 만들기 : ArrayList
// => 단점: 배열의 크키가 고정되기 때문에 배열을 초과하여 값을 넣으면
//         더 큰 새 배열을 만들고, 기존 값을 복사해야 한다.
//         배열의 크기가 늘 때마다 가비지(garbage)가 생기는 문제가 있다.
    
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
        
        list.remove(4);
        print(list); // bbb, ddd,
        
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
