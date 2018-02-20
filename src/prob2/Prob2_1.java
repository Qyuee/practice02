package prob2;

import java.util.Scanner;

public class Prob2_1 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요.");
		
		Scanner scanner=new Scanner(System.in);
		
		int intArray[]=new int[5];
		double sum=0;
		
		for(int i=0; i<intArray.length; i++){
			System.out.print((i+1)+"번 째 정수:"); 
			intArray[i]=scanner.nextInt();
			sum=+sum+intArray[i];
		}
		
		System.out.println("평균:"+(sum/intArray.length));
	}
}
