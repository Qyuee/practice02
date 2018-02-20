package prob4;

import java.util.Scanner;

public class Prob4_1 {
  public static void main(String[] args) {
	  System.out.println("문자열을 입력하세요.");
	  
	  Scanner scanner=new Scanner(System.in);
	  String str=scanner.nextLine();
	  
	  char[] ch_arr=reverse(str);
	  printCharArray(ch_arr);
  }
  
  public static char[] reverse(String str){
	  char[] ch_arr=new char[str.length()];
	  int ch_index=0;
	  for(int i=str.length()-1; i>=0; i--){
		  ch_arr[ch_index]=str.charAt(i);
		  ch_index++;
	  }
	  
	  return ch_arr;
  }
  
  public static void printCharArray(char[] array){
	  for(int i=0; i<array.length; i++){
		  System.out.print(array[i]);
	  }
  }
}
