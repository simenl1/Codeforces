import java.util.Scanner;


public class B {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dances = sc.nextInt();
		int[] dancers = new int[n+1];
		boolean[] avail = new boolean[4];
		for(int i = 0; i < dances; i++){
			for(int j = 0; j < 4; j++){
				avail[j] = false;
			}
			int a = sc.nextInt();
			avail[dancers[a]] = true;
			int b = sc.nextInt();
			avail[dancers[b]] = true;
			int c = sc.nextInt();
			avail[dancers[c]] = true;
			if(dancers[a] == 0){
				for(int j = 1; j < 4; j++){
					if(!avail[j]){
						dancers[a] = j;
						avail[j] = true;
						break;
					}
				}
			}
			if(dancers[b] == 0){
				for(int j = 1; j < 4; j++){
					if(!avail[j]){
						dancers[b] = j;
						avail[j] = true;
						break;
					}
				}
			}
			if(dancers[c] == 0){
				for(int j = 1; j < 4; j++){
					if(!avail[j]){
						dancers[c] = j;
						avail[j] = true;
						break;
					}
				}
			}
		}
		for(int i = 0; i <n; i++){
			if(dancers[i] == 0){
				dancers[i] = 1;
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(dancers[i+1]);
			if(i != n){
				System.out.print(" ");
			}
		}
	}
}
