import java.util.Scanner;


public class C {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String burger = sc.nextLine();
		long B = 0;
		long S = 0;
		long C = 0;
		long count = 0;
		for(int i = 0; i < burger.length(); i++){
			if(burger.charAt(i) == 'B'){
				B++;
			}
			if(burger.charAt(i) == 'S'){
				S++;
			}
			if(burger.charAt(i) == 'C'){
				C++;
			}
		}
		long nB = sc.nextLong();
		long nS = sc.nextLong();
		long nC = sc.nextLong();

		long pB = sc.nextLong();
		long pS = sc.nextLong();
		long pC = sc.nextLong(); 

		long r = sc.nextLong();
		while(true){
			long min = Long.MAX_VALUE;
			if(B != 0){
				min = Math.min(nB/B, min);
			}
			else{
				nB = 0;
			}
			if(S != 0){
				min = Math.min(nS/S, min);
			}
			else{
				nS = 0;
			}
			if(C != 0){
				min = Math.min(nC/C, min);
			}
			else{
				nC = 0;
			}
			count+=min;
			nC -= C*min;
			nS -= S*min;
			nB -= B*min;
			if(nC == nS && nS == nB && nB == 0){
				break;
			}
			if(B!= 0 && nB < B){
				r -= (B-nB)*pB;
				nB = B;
			}
			if(S!= 0 && nS < S){
				r-= (S-nS)*pS;
				nS = S;
			}
			if(C!= 0 && nC < C){
				r-= (C-nC)*pC;
				nC = C;
			}
			if(r < 0){
				break;
			}
		}
		long costOfBurger = B*pB + S*pS + C*pC; 
		if(r > 0){
			count += r/costOfBurger;
		}
		System.out.println(count);

	}
}
