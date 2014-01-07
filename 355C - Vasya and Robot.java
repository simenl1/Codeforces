import java.util.Scanner;


public class C {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long l = sc.nextInt();
		long r = sc.nextInt();
		long Ql = sc.nextInt();
		long Qr = sc.nextInt();
		int[] W = new int[n+1];
		long cost = 0;
		long best = Long.MAX_VALUE;
		W[0] = 0;
		for(int i = 1; i < n+1; i++){
			W[i] = W[i-1] + sc.nextInt();
		}
		for(int i = 0; i <= n; i++){
			cost = 0;
			cost += l*W[i];
			cost += r*(W[n]-W[i]);
			if(i > (n-i)){
				cost+= Ql*(i-(n-i)-1);
			}
			else if( i == (n-i)){
				
			}
			else{
				cost+= Qr*((n-i)-i-1);
			}
			best= Math.min(cost, best);
		}
		System.out.println(best);
		
	}
}
