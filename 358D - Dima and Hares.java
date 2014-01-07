import java.util.Scanner;


public class D {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] zeroFed = new int[n];
		int[] oneFed = new int[n];
		int[] twoFed = new int[n];

		for(int i = 0; i < n; i++){
			zeroFed[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			oneFed[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			twoFed[i] = sc.nextInt();
		}
		if(n == 1){
			System.out.println(zeroFed[0]);
		}
		else if(n == 2){
			int bestest = Math.max(zeroFed[0] + oneFed[1], oneFed[0] + zeroFed[1]);
			System.out.println(bestest);
		}
		else{

			int[] beforeBefore = new int[n];
			int[] beforeAfter = new int[n];
			int[] afterBefore = new int[n];
			int[] afterAfter = new int[n];

			beforeBefore[0] = zeroFed[0];
			beforeAfter[0] = oneFed[0];
			afterBefore[0] = zeroFed[0];
			afterAfter[0] = oneFed[0];

			for(int i = 1; i < n-1; i++){
				beforeBefore[i] = Math.max(beforeAfter[i-1], afterAfter[i-1]) + zeroFed[i];
				beforeAfter[i] = Math.max(beforeAfter[i-1], afterAfter[i-1]) + oneFed[i];
				afterBefore[i] = Math.max(afterBefore[i-1], beforeBefore[i-1]) + oneFed[i];
				afterAfter[i] = Math.max(afterBefore[i-1], beforeBefore[i-1]) + twoFed[i];
			}

			beforeBefore[n-1] = Math.max(beforeAfter[n-2], afterAfter[n-2]) + zeroFed[n-1];
			beforeAfter[n-1] = Math.max(beforeAfter[n-2], afterAfter[n-2]) + zeroFed[n-1];
			afterBefore[n-1] = Math.max(afterBefore[n-2], beforeBefore[n-2]) + oneFed[n-1];
			afterAfter[n-1] = Math.max(afterBefore[n-2], beforeBefore[n-2]) + oneFed[n-1];
			int best = Math.max(beforeBefore[n-1], beforeAfter[n-1]);
			best = Math.max(best, afterBefore[n-1]);
			best = Math.max(best, afterAfter[n-1]);
			System.out.println(best);
		}


	}

}
