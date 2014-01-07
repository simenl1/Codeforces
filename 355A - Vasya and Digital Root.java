import java.util.Scanner;


public class A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int d = sc.nextInt();
		if(k > 1 && d == 0){
			System.out.println("No solution");
		}
		else{
			System.out.print(d);
			for(int i = 1; i < k; i++){
				System.out.print(0);
			}
		}
		
	}
}
