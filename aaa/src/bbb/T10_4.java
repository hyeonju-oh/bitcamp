package bbb;
public class T10_4 {
    public static void main(String[] args) {
        System.out.printf("%o,%x,%h,%f,%b,%tY%n",100,100,100
        ,3.14,true,new java.util.Date());
        System.out.printf("%f,%.1f,%.2f,%.3f,%.4f,%.5f%n",
        3.14,3.14,3.14,3.14,3.14,3.14);
        System.out.printf("%1$f, %1$.1f, %1$.2f, %1$.3f, %1$.4f, %1$.5f\n",
         3.141592);
        System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n",
        "홍길동", 3.14);
        // => [flags]
//    - : 왼쪽 정렬
System.out.printf("'%10s','%-10s'\n", "홍길동", "임꺽정");
//    + : 부호 출력 
        System.out.printf("%d, %+d\n", 100, 100);
//    0 : 빈자리를 0으로 채우기
        System.out.printf("%5d, %05d\n", 123, 123);

// => 날짜/시간 다루기 : %t[날짜관련 접미사]
//    H : Hour. 00 ~ 23
//    I : Hour. 01 ~ 12
//    M : Minute. 00 ~ 59
//    S : Second. 00 ~ 60
//    p : 오전(am), 오후(pm) 출력
        System.out.printf("%1$tH, %1$tI, %1$tM, %1$tS, %1$tp\n", 
            new java.util.Date());
        System.out.printf("%1$tH:%1$tM:%1$tS\n", new java.util.Date());

//    Y : Year. 4자리
//    y : Year. 2자리
//    m : Month. 01 ~ 12
//    d : Day. 01 ~ 31
//    e : Day. 1 ~ 31
//    A : Week. "Sunday"
//    a : Week. "Sun"
//    B : Month name. "January"
//    b : Month name. "Jan"
        System.out.printf("%1$tY, %1$ty, %1$tm, %1$td, %1$te\n", 
            new java.util.Date());
        System.out.printf("%1$tm, %1$tB, %1$tb\n", 
            new java.util.Date());
        System.out.printf("%1$tA, %1$ta\n", 
            new java.util.Date());    

    }
}