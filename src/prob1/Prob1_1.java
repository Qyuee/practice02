package prob1;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob1_1 {
	public static void main(String[] args) {
		System.out.println("금액을 지폐와 동전으로 바꾸기 입니다.");
		
		Scanner scanner = new Scanner( System.in );
		Scanner sc2=new Scanner(System.in);
		
		System.out.print( "금액:" );
		int money = scanner.nextInt();  
		// nextInt()는 Enter를 칠 때 발생하는 개행문자를 처리하지 않고 버퍼에 남긴다.
		// 그렇기에 위에서 Scanner를 따로 사용하지 않으면 \r\n이 버퍼에 남아서 원하는 결과가 나오지 않는다.
		// 이를 해결하기 위해서 보통 flush()와 같은 함수를 사용하는데, Scanner에서는 없다.
		// 이를 해결하는 방법은 중간에 nextLine()을 넣어주거나, Scanner객체를 따로 만들어서 사용한다.
		
		// ** 근본적인 해결방법은 아니며 임시방편이다.
		
		ArrayList standard=new ArrayList<>();
		int st;
		
		System.out.println("변환 할 지폐와 동전을 입력하세요. 0을 입력하면 입력 종료.");
		
		while(true){
			System.out.print("기준 금액 :"); 
			st=sc2.nextInt(); 
			
			if(st==0){ 
				break;  
			}else{
				standard.add(st);
			}
		}
		
		System.out.println("[입력된 변환 기준]");
		for(int i=0; i<standard.size(); i++){ 
			System.out.println((i+1)+". "+standard.get(i)+"원");
		}
		
		System.out.println("[====계산된 결과====]");
		for(int i=0; i<standard.size(); i++){
			int count=money/(Integer)standard.get(i);
			money=money-(count*(Integer)standard.get(i));
			System.out.println(standard.get(i)+"원 : "+count+"개");
		}
	}
}
