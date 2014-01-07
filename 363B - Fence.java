import java.util.Scanner;


public class B {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int minHeight = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0; i < n; i++ ){
			a[i] = sc.nextInt();
		}
		int current = 0;
		for(int i = 0; i < k; i++){
			current += a[i];
		}
		minHeight = current;
		for(int i = k; i < n; i++){
			current = current + a[i] - a[i-k];
			if(current < minHeight){
				minHeight = current;
				minIndex = i-k+1;
			}
		}
		System.out.println(minIndex+1);
	}
}
