import java.util.Scanner;


public class C {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		long[] rev = new long[n+1];
		for(int i = 1; i < n+1; i++){
			rev[i] = rev[i-1]+a[i-1]; //CORRECT
		}
		sc.nextLine();
		String m = sc.nextLine();
		long mResult = 0;
		long best = 0;
		for(int i = m.length()-1; i>=0; i--){
			if(m.charAt(i) == '1'){
				best = Math.max(best, mResult + rev[i]);
				mResult += a[i]; //CORRECT
			}
		}
		best = Math.max(best, mResult);
		System.out.println(best);
	}
}
