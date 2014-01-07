import java.util.Arrays;
import java.util.Scanner;


public class B {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] badStairs = new int[m];
		for(int i  = 0; i < m; i++){
			badStairs[i] = sc.nextInt();
		}
		Arrays.sort(badStairs);
		int count = 0;
		int last = -2;
		boolean possible = true;
		for(int i = 0; i < m; i++){
			if(badStairs[i] == 1){
				possible = false;
				break;
			}
			if(badStairs[i] == n){
				possible = false;
				break;
			}
			if(badStairs[i] - 1 == last){
				count++;
				last = badStairs[i];
			}
			else{
				last = badStairs[i];
				count = 0;
			}
			if(count > 1){
				possible = false;
				break;
			}
		}
		if(possible){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
