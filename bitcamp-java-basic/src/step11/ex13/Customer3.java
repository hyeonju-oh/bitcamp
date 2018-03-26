package step11.ex13;

public class Customer3 {
    
    private String name;
    private int age;
    private int weight;
    private int height;
    
    public void setName(String name) {
        if (name == null) {
            this.name = "이름 없음";
            return;
        }
        if (name.length() < 2) {
            this.name = "이름 없음";
            return;
        }
        // 이름은 최대 5자만 넣는다.
        if (name.length() > 5) {
        this.name = name.substring(0, 5);
        } else {
            this.name = name;
        }
    }
    
    // 인스턴스 변수 age의 값을 넣는 메서드
    // => 나이 값이기 때문에 유효한 값은 1 ~ 120이다.
    public void setAge(int age) {
        if (age < 1 || age > 120) {
            this.age = 0;
            return;
        }
        this.age = age;
    }
    
    // 인스턴스 변수 weight의 값을 넣는 메서드
    // => 몸무게는 1 ~ 200이다.
    public void setWeight(int weight) {
        if (weight < 1 || weight > 200) {
            this.weight = 0;
            return;
        }
        this.weight = weight;
    }
    
    public void setHeight(int height) {
        if (height < 1 || height > 300) {
            this.height = 0;
            return;
        }
        this.height = height;
    }
    
    // 외부에서 인스턴스 변수의 값을 조회할 수 있는 메서드를 제공한다.
    // => 보통 메서드의 이름은 get으로 시작한다.
    // => 그래서 "겟터(getter)"라 부른다.
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public int getHeight() {
        return this.height;
    }
}
