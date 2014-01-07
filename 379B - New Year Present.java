import java.util.Scanner;


public class B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ai = new int[n];
		int[] cur = new int[n];
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < n; i++){
			ai[i] = sc.nextInt();
		}
		for(int i  = 0; i < n; i++){
			if(i == 0){
				while(ai[i] > cur[i]){
					ans.append('P');
					cur[i]++;
					if(ai[i] > cur[i]){
						ans.append('R');
						ans.append('L');
					}
				}
			}
			else{
				while(ai[i] > cur[i]){
					ans.append('P');
					cur[i]++;
					if(ai[i] > cur[i]){
						ans.append('L');
						ans.append('R');
					}
				}
			}
			if(i != n-1){
				ans.append('R');
			}
		}
		System.out.println(ans);
	}
}
