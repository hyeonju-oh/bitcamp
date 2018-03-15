class A {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

    }
}

//컴파일러는 소스 파일을 컴파일 할 때 그 소스 파일이 os의 기본 인코딩으로 되어 있을 것으로 간주한다
//만약 소스파일이 os 기본 문자집합이 아닌 다른 문자집합으로 인코딩되어 있다면,
//컴파일 할 때 컴파일러에게 알려줘야 한다.
//java -encoding UTF-8 Exam01.java