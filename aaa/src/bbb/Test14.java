package bbb;
public class Test14 {
    public static void main(String[] args) {
        class score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;

        }
        score r1;
        r1 = new score();

        r1.name = "홍길동";
        r1.kor = 100;
        r1.eng = 98;
        r1.math = 95;
        r1.sum = r1.kor + r1.eng + r1.math;
        r1.aver = r1.sum / 3.0f;

        System.out.printf("%s %d %d %d %d %f\n",
        r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);

        score r2=r1;
        r1=new score();

        r1.name = "임꺽정";
        r1.kor = 80;
        r1.eng = 100;
        r1.math = 95;
        r1.sum = r1.kor + r1.eng + r1.math;
        r1.aver = r1.sum / 3.0f;
        
        System.out.printf("%s %d %d %d %d %f\n",
        r1.name, r1.kor, r1.eng, r1.math, r1.sum, r1.aver);

        System.out.printf("%s %d %d %d %d %f\n",
        r2.name, r2.kor, r2.eng, r2.math, r2.sum, r2.aver);

    }
}