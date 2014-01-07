import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		for(int i = n.length() -1; i > -1; i--){
			int digit = n.charAt(i) - '0';
			if(digit >= 5){
				System.out.print("-O|");
				digit -= 5;
			}
			else{
				System.out.print("O-|");
			}
			int rest = Math.abs(digit -5);
			while(digit > 0){
				System.out.print('O');
				digit--;
			}
			System.out.print('-');
			while(rest > 1){
				System.out.print('O');
				rest--;
			}
			System.out.println();
		}
	}

}
