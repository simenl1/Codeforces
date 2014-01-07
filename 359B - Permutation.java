import java.util.Scanner;


public class B {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(k > 0){
				System.out.print(2*i + " " + (2*i-1));
				k--;
			}
			else{
				System.out.print((2*i-1) + " " + 2*i);
			}
			if(i != n){
				System.out.print(" ");
			}
		}
	}
}
