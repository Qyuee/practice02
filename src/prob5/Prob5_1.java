package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5_1 {
	public static void main(String[] args) {
		System.out.println("수를 맞춰 보세요!!");
		
		int minimum=1;
		int maximum=100;
		
		while(true){
			
			Random random=new Random();
			int randomNum=random.nextInt(maximum)+minimum;
			System.out.println(randomNum);
			
			Scanner scanner=new Scanner(System.in);
			int inputNum;
			int tryCount=1;
			
			
			while(true){
				System.out.print(tryCount+">>");
				inputNum=scanner.nextInt();  
				
				if(randomNum==inputNum){
					System.out.println("정답입니다!! 시도횟수:"+tryCount);
					break;
				}else if(randomNum>inputNum){
					System.out.println("더 높게");
					tryCount++;
				}else if(randomNum<inputNum){
					System.out.println("더 낮게");
					tryCount++;
				} 
			}
			
			System.out.print("다시하시겠습니까?(y/n)");
			String answer=scanner.next();
			
			if(answer.equals("n")){
				System.out.println("게임을 종료 합니다!!!!");
				break;
			}
		}
	}
}
