package bitcamp.java106.pms;
import java.util.Random;
import java.util.Scanner;

public class Random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String[] name = {"강동현", "경명수", "김가람", "김관희", "김기남", "김범수", 
			"김복진", "김소영", "김승환", "김정현", "문선민", "박서경", "박수현",
			"박현기", "서도경", "성현동", "오현주", "이동현", "이상경", "이왕로", 
			"이정호", "임현식", "장하은", "정준기", "차진호", "최보람", "한돈희", 
			"홍정호", "황재천"};
		boolean[] check = new boolean[30];
		int count = 0;
	
		while (true) {
			int randNumber = random.nextInt(30);
			if (randNumber > 0 && check[randNumber] == false) {
				check[randNumber] = true;
				System.out.println(name[count++] + " : " + randNumber);
				
			}
			if (count == 29) {
				System.out.println("*************추첨종료*************");
				break;
			}
		}		
	}
}