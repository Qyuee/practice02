package prob3;

public class Prob3_1 {
	public static void main(String[] args) {
		char c[] ={'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'P', 'e', 'n', 'c', 'i', 'l', ' '};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
	public static void printCharArray(char c[]){
		for(int i=0; i<c.length; i++){
			System.out.print(c[i]);
		}
		System.out.println();
	}
	
	public static void replaceSpace(char c[]){
		for(int i=0; i<c.length; i++){
			if(c[i]==' '){
				c[i]=',';
			}
		}
	}
}
